package com.example.graded_exercise_intent_and_listview_task;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] versionNames = {"Android 1.0",
            "Android 1.1", "Cupcake", "Donut",
            "Eclair", "Froyo", "Gingerbread",
            "Honeycomb", "Ice Cream Sandwich", "Jelly Bean",
            "Kitkat", "Lollipop", "Marshmallow",
            "Nougat", "Oreo", "Pie",
            "Android 10", "Android 11", "Android 12"};
    int[] versionImages = {R.drawable.android10, R.drawable.android11, R.drawable.cupcake,
            R.drawable.donut, R.drawable.eclair, R.drawable.froyo,
            R.drawable.ginger_bread, R.drawable.honey_comb, R.drawable.icecream_sandwich,
            R.drawable.jelly_bean, R.drawable.kitkat, R.drawable.lollipop,
            R.drawable.marshmallow, R.drawable.nougat, R.drawable.oreo,
            R.drawable.pie, R.drawable.android_10, R.drawable.android_11, R.drawable.android_12,};
    String[] versionDescriptions = {
            "Android 1.0 was Google's first Android release. Web browser support, camera support, Gmail, Contacts, Google Maps, and YouTube application were among the initial capabilities. Although it does not have an official name like the other Android variations, it is known informally as Apple Pie. In Android 1.0, the API level is set to 1. It is no longer utilized in mobile devices. It was published on September 23, 2008.",
            "Google released Android 1.1, which is the second version of the operating system. It resolved all of the issues seen in the previous version, including the version's improved APIs. Users had the ability to save attachments in messages. Caller ID lookup now has several new capabilities, such as the ability to hide and expose the numeric keypad. This version also has a function for preserving MMS attachments. It also does not have an official version name like Android 1.0, although it is known as Banana Bread informally. It came out on February 9, 2009.",
            "The tradition of Android version names started with the release of Android 1.5 Cupcake in early 2009. Cupcake brought a slew of improvements to the Android interface, including the first on-screen keyboard, which would become increasingly important as phones moved away from the once-ubiquitous physical keyboard format. Cupcake also included the framework for third-party app widgets which would fast become one of Android's most distinctive features, as well as the platform's first-ever video recording option.",
            "Android 1.6 Donut was introduced in the fall of 2009. Donut fixed key important holes in Android's core, including the OS's ability to function on a wider range of screen sizes and resolutions, which was a crucial feature in the years ahead. It also introduced support for CDMA networks like Verizon, which will be crucial in Android's rapid growth.",
            "Android 2.0 Eclair is an Android version that was first released on October 26, 2009. Android 1.6 Donut was its predecessor, while Android 2.1 Eclair was its successor. It was powered by Motorola Droid. Android 2.1 was updated to Android 3.0 Honeycomb on January 12, 2010. On June 30, 2017, Google stopped supporting Android 2.0 and older.",
            "Google Android 2.2 Froyo operating system is the company's third major release. Google tried its best to update the OS with several impressive updates as well as a few fixes. Android 2.2 Froyo 2.2.3 then released. Speed, APIs, and services, Browser, and Android Market are four areas from this release that you should be aware of. In terms of performance, Google launched the Dalvik JIT (Just In Time) compiler, which boosts CPU code performance by 2-5 times over Android 2.1. Google launched cloud-to-device messaging to allow developers to provide a better sync and notification experience for their users.",
            "With the introduction of Gingerbread in 2010, Android's first genuine visual identity came into prominence. Bright green had long been the color of Android's robot mascot, and it became a fundamental aspect of the operating system's design with Gingerbread. As Android began its long march toward unique design, black and green slipped into the UI.",
            "Honeycomb is unique in that it is a tablet-only operating system that, according to Google, will not be coming to smartphones. One noteworthy distinction in Honeycomb is the physical buttons are no longer required. Instead, they are replaced by on-screen buttons. The three software buttons on the bottom left of the screen (back, home, and the multitasking app switcher) switching between running apps). Additional information and functionality may be found in the bottom right: internet connection status, and a notification bar.",
            "Android 4.0 improves on the features that users love about Android, such as simple multitasking, rich alerts, customizable home screens, resizable widgets, and deep interactivity, while also introducing entirely new communication and sharing colors.",
            "Android 4.1 improves on the speed and smoothness introduced in Jelly Bean, such as triple buffering, increased touch latency, CPU input boost, and hardware-accelerated 2D graphics, by adding new optimizations. The hardware-accelerated 2D renderer now optimizes the stream of drawing commands, getting it into a more efficient GPU format by reorganizing and combining draw operations for improved graphics performance. The renderers may now employ multithreading across several CPU cores to accomplish some tasks for multithreaded processing.",
            "Android 4.4 KitKat is an Android version. Android 4.3 Jelly Bean is its predecessor, while Android 5.0 Lollipop is its successor. KitKat aims to improve the overall user experience on the smartphone. Android 4.4 was released as Android 4.4.4 in July 2014. KitKat 4.4 includes many new features to enhance the user experience and provide a polished feel across the Android device that it is running on. Android 4.4 was designed to require less ram than before, in order to help its performance on phones with less than 1 Gigabyte of RAM.",
            "With the introduction of Android 5.0 Lollipop in the autumn of 2014, Google fundamentally revamped Android once more. Lollipop introduced the now-iconic Material Design standard, which gave Android, its applications, and even other Google products a completely new appearance. The card-based nature that had been slowly introduced in Android became a primary UI pattern, guiding the design of everything from alerts, which now appeared on the lock screen for at-a-glance access, to the Recent Apps list, which took on an out-right card-based appearance.",
            "Android 6.0 Marshmallow was launched as Android M during Google I/O 2015, and it is the successor to Android 5.1 Lollipop. It was accessible to developers as a preview release in late May 2015, and will be fully launched in the third quarter of 2015. According to Google's Vice President for Android, Hiroshi Lockheimer, \"We've gone back to the basics\" with Android M. We've spent a lot of time polishing and improving quality. We've actually fixed hundreds of issues. On August 17, a statue was uncovered that revealed the name: Android Marshmallow. Android 6.0 was released as Android 6.0.1 on October 5, 2015.",
            "In 2016, Google released Android Nougat, which included a native split-screen mode, a new bundled by app notification system, and a Doze power saver feature. Nougat also included several minor but useful improvements, including an all-new Tab-like shortcut for switching apps.",
            "Oreo was also the first Android version to include Project Treble, an ambitious effort to provide a modular base for Android's code in the hopes of making it easier for device manufacturers to provide timely software updates.",
            "In August of 2018, the aroma of freshly baked Android Pie, also known as Android P, filled the Android ecosystem. The most significant change in the way this hybrid gesture-button navigation system, which replaced Android's traditional Back, Home, and Overview keys with a single, multi-functional Home button and a small Back button that appears alongside it as needed. Pie's productivity features also included a universal suggested reply system for message alerts, a new Dashboard of Digital Wellbeing settings, and more intelligent algorithms for power and screen brightness management.",
            "The Android environment has changed dramatically since Android 10. The rebranding marks the end of the age of dessert names, as Google has now fully embraced gesture controls. Despite these new approaches, Android remains the same OS that we are all familiar with. The main themes for Android 10 were gesture controls, increased security, and improved functionality. Overall, the upgrade feels like a continuation of Android Pie. However, when compared to Android Marshmallow and Android Oreo, there is still a significant difference between Android Pie and Android 10.",
            "Android 11, which was released in early September 2020, is a significant Android update both inside and outside. The most notable improvements in this version concern privacy; the update expands on the extended permissions system introduced in Android 10 by allowing users to provide applications specific rights — such as location access, camera access, and microphone access — only on a limited, one-time basis.",
            "Android 12 is our most personal operating system ever, with dynamic color capabilities that change depending on your wallpaper and responsive motion that responds to your touch. Android 12 is meant to be accessible for even more people, with a more roomy layout, color contrast enhancements, and new tools to assist individuals with low vision. From fonts, light, and motion to changeable system colors that can be changed to match you. Android 12 refines the whole user interface. It's our most expressive, dynamic, and personal OS yet, redesigned to be more roomy and comfy."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter();
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("title", versionNames[position]);
            intent.putExtra("description", versionDescriptions[position]);
            intent.putExtra("image", versionImages[position]);
            startActivity(intent);
        });
    }

    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return versionNames.length;
        }

        @Override
        public Object getItem(int position) {
            return versionNames[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, android.view.ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.list_item, null);
            TextView textView = view.findViewById(R.id.textView);
            ImageView imageView = view.findViewById(R.id.imageView);
            textView.setText(versionNames[position]);
            imageView.setImageResource(versionImages[position]);
            return view;
        }
    }
}