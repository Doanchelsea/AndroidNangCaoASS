package doannvph05829.com.androidnangcaoass.database.adapter;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import doannvph05829.com.androidnangcaoass.R;
import doannvph05829.com.androidnangcaoass.database.SqlDao.UserDAO;
import doannvph05829.com.androidnangcaoass.database.hodel.UserHolder;
import doannvph05829.com.androidnangcaoass.database.model.User;

public class AdapterUser extends RecyclerView.Adapter<UserHolder> {
    private Context context;
    private List<User> users;
    private UserDAO userDAO;

    public AdapterUser(Context context, List<User> users, UserDAO userDAO) {
        this.context = context;
        this.users = users;
        this.userDAO = userDAO;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( context ).inflate( R.layout.item_nguoidung,parent,false );
        return new UserHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, final int position) {
     final User user = users.get( position );
      holder.tvId.setText( "Môn :"+user.id );
      holder.tvTen.setText( user.name );
      holder.tvSdt.setText( user.phone );
      holder.imgxoa.setOnClickListener( new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              long result = userDAO.deleteUser( user.id );
           users.remove( position );
           notifyDataSetChanged();
          }
      } );
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
