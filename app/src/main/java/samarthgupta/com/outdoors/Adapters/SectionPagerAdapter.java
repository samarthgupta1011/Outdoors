package samarthgupta.com.outdoors.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import samarthgupta.com.outdoors.Fragments.EventsFragment;
import samarthgupta.com.outdoors.Fragments.PlaySpaceFragment;

public class SectionPagerAdapter extends FragmentPagerAdapter {
    public static int frag = 0;

    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new EventsFragment();
            case 1:
                return new PlaySpaceFragment();
//            case 2:
//                return new EventFragment();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
//        switch (position) {
//            case 0:
//                return "Events";
//            case 1:
//                return "Frag";
////            case 2:
////                return "EVENTS";
//        }
        return null;
    }



}
