package edu.pitt.cs.cs1635.studybuddies;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Louie on 3/13/17.
 */

public class User {
    String name = "";
    static ArrayList<Group> Gfavorites;
    static int c = 0;



    /**
     * Constructor
     * @param n name of user
     */
    public User(String n){
        name = n;
        Gfavorites = new ArrayList<>();
    }

    /**
     * change current user's username
     * @param newUsername new name
     */
    public void changeUsername(String newUsername){
        name = newUsername;
    }

    /**
     * add a new group to favorites
     * @param g group to be added to favorites
     */
    public void addFavorite(Group g){
        Gfavorites.add(g);
        if(c <= 0 ){
            g.addMember();
        }
    }

    public ArrayList<Group> getFavorites(){
        return Gfavorites;
    }

    public String getName(){ return name; }


    /**
     * return username
     * @return string representation of user's name
     */
    @Override
    public String toString(){
        return name;
    }
    
}
