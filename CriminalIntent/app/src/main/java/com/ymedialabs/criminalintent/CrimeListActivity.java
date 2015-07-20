package com.ymedialabs.criminalintent;

import android.app.Fragment;

/**
 * Created by sinan.erdem on 7/20/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
