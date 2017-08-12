package com.WatchMovie.AndroidSport.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.WatchMovie.AndroidSport.R;
import com.WatchMovie.AndroidSport.activity.ActivitySportList;

/**
 * 主页面---我的
 * Created by liuheng on 16/7/14.
 */
public class FragmentMine extends Fragment {

    private TextView mSportMessageTv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mine,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mSportMessageTv = (TextView) view.findViewById(R.id.mine_sport_message_tv);
        mSportMessageTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivitySportList.class);
                startActivity(intent);
            }
        });
    }
}
