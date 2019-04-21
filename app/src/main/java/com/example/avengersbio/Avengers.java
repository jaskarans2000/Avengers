package com.example.avengersbio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Avengers extends AppCompatActivity {
private ImageView avenger;
private TextView name;
private TextView  description;
private Bundle extras;
private StringBuilder stringBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avengers);
        avenger=(ImageView)findViewById(R.id.imageView2);
        name=(TextView)findViewById(R.id.textView);
        description=( TextView)findViewById(R.id.textView2);
        extras=getIntent().getExtras();
        String n=extras.getString("Name");
        display(n);
    }
    void display(String m)
    {
        name.setText(m);
        stringBuilder=new StringBuilder();
        if(m.equals("Robert Downey Jr."))
        {
            avenger.setImageDrawable(getResources().getDrawable(R.drawable.ironman));
            stringBuilder.append("Robert John Downey Jr. (born April 4, 1965) is an American actor and singer. ... Making his acting debut at the age of five, appearing in his father's film Pound (1970), Downey appeared in roles associated with the Brat Pack, such as the teen sci-fi comedy Weird Science (1985) and the drama Less Than Zero (1987).");//="Robert John Downey Jr. (born April 4, 1965) is an American actor and singer. ... Making his acting debut at the age of five, appearing in his father's film Pound (1970), Downey appeared in roles associated with the Brat Pack, such as the teen sci-fi comedy Weird Science (1985) and the drama Less Than Zero (1987).";
            description.setText(stringBuilder);
        }
        if(m.equals("Scarlett Johansson"))
        {
            avenger.setImageDrawable(getResources().getDrawable(R.drawable.black));
            stringBuilder.append("Born on November 22, 1984, in New York City, actress Scarlett Johansson comes from a long line of creative artists. Her Danish grandfather worked as a screenwriter and director, and her mother worked as a producer. ... Her first leading part came two years later with Manny & Lo, an independent dramatic comedy.");
            description.setText(stringBuilder);
        }
        if(m.equals("Christopher Robert Evans"))
        {
            avenger.setImageDrawable(getResources().getDrawable(R.drawable.captain));
            avenger.setBaselineAlignBottom(false);
            stringBuilder.append("Christopher Robert Evans (born June 13, 1981) is an American actor. Evans is known for his superhero roles as the Marvel Comics characters Captain America in the Marvel Cinematic Universe and Human Torch in Fantastic Four (2005) and its 2007 sequel.");
            description.setText(stringBuilder);
        }
        if(m.equals("Mark Ruffalo"))
        {
            avenger.setImageDrawable(getResources().getDrawable(R.drawable.hulk));
            stringBuilder.append("Mark Alan Ruffalo is an American actor, producer, and political activist who made his screen debut in an episode of CBS Summer Playhouse, followed by minor film roles. He was part of the original cast of This Is Our Youth.");
            description.setText(stringBuilder);
        }
        if(m.equals("Christopher Hemsworth"))
        {
            avenger.setImageDrawable(getResources().getDrawable(R.drawable.thor));
            stringBuilder.append("Christopher Hemsworth is an Australian actor. He rose to prominence playing Kim Hyde in the Australian TV series Home and Away");
            description.setText(stringBuilder);
        }
    }
}
