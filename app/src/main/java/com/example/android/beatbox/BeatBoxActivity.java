package com.example.android.beatbox;

import android.support.v4.app.Fragment;
import android.util.Log;

public class BeatBoxActivity extends SingleFragmentActivity {

    public static final String TAG = "BBox: BeatBoxActivity";

    @Override
    protected Fragment createFragment() {
        Log.d(TAG, "createFragment");
        return BeatBoxFragment.newInstance();
    }
}
