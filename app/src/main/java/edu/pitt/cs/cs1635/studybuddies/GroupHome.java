package edu.pitt.cs.cs1635.studybuddies;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.Window;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.widget.TextView;

import java.io.Console;
import java.util.ArrayList;


public class GroupHome extends AppCompatActivity implements View.OnClickListener {

    private Button studyGroupListButton;
    private Button groupQButton;
    private static Group group;

    Intent inIntent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_group_home);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //set the buttons to correspond to the correct ids
        studyGroupListButton = (Button) findViewById(R.id.studyGroupsButton);
        groupQButton = (Button) findViewById(R.id.groupQsButton);

        //set onClick listeners for the buttons
        studyGroupListButton.setOnClickListener(GroupHome.this);
        groupQButton.setOnClickListener(GroupHome.this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
//        if(id == R.id.fav_button) {
//            Intent intent = new Intent(this, FavoritesActivity.class);
//            ArrayList<String> favorites = new ArrayList<>();
//            for (Group g : userObj.getFavorites()) {
//                favorites.add(g.toString());
//            }
//            intent.putExtra("favorites", favorites);
//            startActivity(intent);
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    public void setUp(Group gr){

        String name = gr.getName();
        int numOfMembers = gr.getNumMembers();

        TextView groupNameDisp = (TextView) findViewById(R.id.groupNameHeader);
        groupNameDisp.setText(name);

        TextView numMemsDisp = (TextView) findViewById(R.id.textView2);
        numMemsDisp.setText(numOfMembers);

    }


    public static void setGroup(Group currentGroup) {

        group = currentGroup;
        Log.w("name", group.getName());

    }

    /**
    * Method for when the buttons are clicked
    *
    * @param v
    */
       @Override
   public void onClick(View v) {
       if (v.getId() == R.id.studyGroupsButton) {
           //need an intent to take to the activity with the studygroups
       } else if (v.getId() == R.id.groupQsButton) {
}              //need an intent to take to the activty with the groupquestions
       }
   }
