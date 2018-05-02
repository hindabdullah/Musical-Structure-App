package com.example.android.musicalalbum;

/**
 * Created by hind on 06/01/18.
 */

public class SongList {

    // Name of the Song
    private String mSongName;

    // Name of the Artist
    private String mArtistName;

    public SongList (String sName, String aName)
    {
        mSongName = sName;
        mArtistName = aName;
    }
    /**
     * Get the name of the Song Name
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the Android Artist Name
     */
    public String getArtistName() {
        return mArtistName;
    }
}