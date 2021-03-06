package doannvph05829.com.androidnangcaoass.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import doannvph05829.com.androidnangcaoass.LichHoc;
import doannvph05829.com.androidnangcaoass.LichHocAdapter;
import doannvph05829.com.androidnangcaoass.R;

public class LichThiFragment extends Fragment {
    private View lichhoc;
    private RecyclerView faLichThi;

    private List<LichHoc> lichHocList;
    private LichHocAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        lichhoc = inflater.inflate( R.layout.lichthifragment, container, false );

         faLichThi= lichhoc.findViewById( R.id.faLichThi );


        lichHocList = new ArrayList<>();

        lichHocList.add(new LichHoc("Thứ 4,Ngày 17/10/2018","D415","Tiếng Anh 2.1","Trần Minh Hằng"));
        lichHocList.add(new LichHoc("Thứ 5,Ngày 18/10/2018","D414","Dự Án Mẫu","Nguyễn Hữu Huy"));
        lichHocList.add(new LichHoc("Thứ 6,Ngày 19/10/2018","D411","Android Nâng Cao","Nguyễn Hữu Huy"));
        adapter = new LichHocAdapter(lichHocList);
        faLichThi.setAdapter(adapter);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getActivity());
        faLichThi.setLayoutManager(manager);
        return lichhoc;
    }
}
