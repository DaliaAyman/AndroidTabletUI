package com.android.dalia.androidtabletui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import com.android.dalia.androidtabletui.adapters.AndroidVersionsAdapter;
import com.android.dalia.androidtabletui.models.AndroidVersion;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<AndroidVersion> versionsList = new ArrayList<>();
    private RecyclerView recyclerView;
    private AndroidVersionsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new AndroidVersionsAdapter(getApplicationContext(), versionsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareVersionsData();

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                AndroidVersion androidVersion = versionsList.get(position);
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("version", androidVersion);
                startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }

    private void prepareVersionsData() {
        versionsList.add(new AndroidVersion("Cupcake", R.drawable.cupcake, 1.5, 3,
                "This was the version which made companies look into Android and use it. Google also started the naming scheme from here and named it Cupcake. The first mobile to test it was T-Mobile’s  MyTouch 3G. After that Samsung launched its first device on Android named Samsung Moment. Motorola also tried their hands on Android with Motorola Cliq. Android 1.5 Cupcake included several new features and UI amendments like auto-rotation, copy and paste features,  MPEG-4 and 3GP formats format support, Widgets and screen transitions. Mainly Google put all efforts on UI of the System.\n"));

        versionsList.add(new AndroidVersion("Donut", R.drawable.donut, 1.6, 4,
                "Android named this version Donut and released it on September 15, 2009. Now people got their facts cleared about naming of Android as in alphabetical order. This version was first tasted by Samsung Moment and HTC dream. Motorola Devour also got launched on this version of Android. This version included easier searching, Voice and text entry search,  Camera and gallery enhancements, support for (CDMA/EVDO, 802.1x, VPNs), speed and gesture feature.\n"));

        versionsList.add(new AndroidVersion("Éclair", R.drawable.eclair, 2.0, 7,
                "Android 2.0/2.1 codenamed Eclair was the version which introduced talks about Android among people. Android 2.0 SDK was packed with several changes like Bluetooth 2.1 support, new camera features, support for HTML5, better UI, multi-touch support, etc. In 2010 Android SDK 2.1 was introduced under same name with several bug fixes for new features. Motorola Droid was the first phone to make the it run.\n"));

        versionsList.add(new AndroidVersion("Froyo", R.drawable.android, 2.2, 8,
                "Android named Android 2.2 as Froyo as according to alphabetical order on May 20, 2010. It included speed, performance and memory optimizations. Later on various advancements came under this version of Android named as SDK 2.2.1, 2.2.2 and 2.2.3, all packed with bug fixes, security improvement and performance tweaks. Again Motorola was the first to introduce Android 2.2 on Motorola Droid 2.\n"));

        versionsList.add(new AndroidVersion("Gingerbread", R.drawable.gingerbread, 2.3, 10,
                "December 6, 2010 launched a new version of Android and it is currently most distributed and used version of Android. According to recent reports it still powers about 50% of Android running devices. Android SDK 2.3 was updated with various new enhancements, features and some new bugs also. Android 2.3 Gingerbread changed the game and smartphone market started to tilt in Android’s way. To make it much better, Google introduced various new SDK’s for same version like 2.3.3, 2.3.4, 2.3.5, 2.3.6 and 2.3.7. Google stated their own device to run it firstly and was named Samsung Nexus S."));

        versionsList.add(new AndroidVersion("Honeycomb", R.drawable.honeycomb, 3.2, 13,
                "It was launched on February 22, 2011. Android 3.x Honeycomb was specially built for Android running Tablets. Motorola Xoom was the first tablet on which Honeycomb runs. Now all features were available at higher resolution for Tablets. Later on Various other versions were introduced by Google.\n"));

        versionsList.add(new AndroidVersion("Ice cream sandwich", R.drawable.icecream, 4, 15,
                "It was publicly released on October 19, 2011 and was named Ice Cream Sandwich. This version included the most beautiful User Interface for any smartphone. Various new features were introduced. Samsung Galaxy Nexus was the first phone to run it.\n"));

        versionsList.add(new AndroidVersion("Jelly Bean", R.drawable.jellybeans, 4.3, 18,
                "Announced on June 27, 2012 at Google IO 2012 with a big bang. With its launch we got to know about things which were unbelievable earlier like Project Butter, Google Now, etc. This was the first time that Google launched it on Nexus 7 Tablet not on any Phone. They also launched Nexus Q, social media streamer running on Jelly Bean.\n"));

        versionsList.add(new AndroidVersion("Kitkat", R.drawable.kitkat, 4.4, 19,
                "Android 4.4 KitKat is a version of Google's operating system (OS) for smartphones and tablets.\n" +
                        "The Android 4.4 KitKat operating system uses advanced memory optimization technologies. As a result, it is available on Android devices with as little as 512 MB of RAM.  This is important because previous versions of the operating system required more internal memory which made them incompatible with many older device models. This was a major cause of the problem known as Android fragmentation.\n" +
                        "\n" +
                        "Android 4.4 KitKat features a cleaner user interface, Near Field Communication (NFC) support and always-on touch screen action buttons, which replace the need for the physical buttons found on many Android devices. KitKat also boasts an improved security-enhanced Linux module, which helps prevent unauthorized app access.\n" +
                        "Google announced Android 4.4 KitKat in September 2013 and debuted it on the Nexus 5 smartphone the following month. For months prior to the release, observers expected the OS to be called Key Lime Pie, but Google renamed it as part of a marketing promotion with the Hershey Company, which sells a candy bar called Kit Kat in the United States.\n"));

        versionsList.add(new AndroidVersion("Lollipop", R.drawable.lollipop, 5.1, 22,
                "The all new Android 5.0 Lollipop operating system has landed first on the latest Nexus devices – Nexus 4, Nexus 5, Nexus 6, Nexus 9 and Nexus Player.\n" +
                        "Android chief Sundar Pichai had earlier said this is the largest and most ambitious release on Android to date. Here are the best features announced in the latest Android OS:\n" +
                        "1. Pick up where you left off: Similar to Continuity in iOS 8, Lollipop lets you pick up where you left off, so the songs, photos, apps, and even recent searches from one of your Android devices can be immediately accessed across devices.\n" +
                        "2. Multiple device compatibility: Lollipop will support devices with different screen sizes including wearables such as smartwatches, TVs and cars. According to Google, it is designed to be flexible, so that it can work on all your devices and customised for your needs.\n" +
                        "3. Material Design: In order to maintain a consistent design experience across all Android devices, Lollipop uses the Material Design interface across devices it runs on.With Material Design, elements can dynamically shrink and expand, there’s more white space between elements, and gives a 3D appearance overall. While we are yet to try it out ourselves, Google claims that the new design is more intuitive and transitions between tasks are more fluid.\n" +
                        "4. Updated camera: Lollipop makes it easier to support features like burst mode and fine settings tuning. You’ll be able to capture full resolution frames around 30fps, and shoot in raw formats like YUV and Bayer RAW. There’s also support for UHD 4K video playback, tunneled video for high quality video playback on Android TV and improved streaming. Lollipop adds professional features to control settings for the sensor, lens and flash per individual frame.\n" +
                        "5. Battery settings: There’s a new battery-saver feature that extends the life of your device by up to 90 minutes—helpful if you’re far from a power outlet. It’s also easier to manage your power usage. The OS adds a feature which gives the estimated time left before you need to charge and, when it’s charging, it tells you approximately how much time it will need to charge before it’s ready to go.\n" +
                        "6. Improved security: Share your device securely with guest user mode, create multiple user accounts to enable friends to log in on your device. In either case, no one will be able to access your private files. There’s Android Smart Lock to secure your phone or tablet by pairing it with a trusted device like your wearable or even your car. Google has enforced the SELinux security module for all apps to give better protection against vulnerabilities and malware.\n" +
                        "7. Updated notifications screen: You can now view and respond to messages directly from your lock screen, or hide notifications for sensitive content. Turning on Priority mode through your device’s volume button will allow only certain people and notifications get through.You can also choose to avoid calls from interrupting the game you are playing or the movie you are watching.\n" +
                        "8. New Quick Settings: The updated Quick Settings on the notification screen has new handy controls such as flashlight, hotspot, screen rotation and cast screen controls. While these settings were not on older stock-Android devices, they may already be present on other customised Android devices. Similarly, you can manually adjust the brightness for certain conditions, while adaptive brightness will kick in based on ambient lighting.\n" +
                        "9. Smoother experience: Google uses a new runtime on Android (called ART), which claims to improve app performance, battery life and responsiveness. Google claims that the new OS improves Android’s performance by four times. It compacts background apps and services so you can do more at once. There’s also support for 64-bit chips now.\n" +
                        "10. Tap and Go: Tap and Go for NFC devices lets you set up your new Android phone or tablet instantly by simply tapping it to your old one. Whenever you get a new Android phone or tablet, you can sync your apps from Google Play automatically from any of your old Android devices.\n" +
                        "As with all OS updates, there are minor improvements on the camera, video and audio experience, along with better multitasking, performance and battery life. Overall, Lollipop will provide a smoother user experience, more usable apps and services and help you manage bloatware. Google has also announced it will re-enable microSD card writing support and segmentation of firmware for older devices.\n"));

        versionsList.add(new AndroidVersion("Marshmallow", R.drawable.marshmallow, 6, 23,
                "Android 6.0–6.0.1 \"Marshmallow\" (codenamed M during development) is the 6th major version of the Android operating system. First unveiled in May 2015 at Google I/O, it was officially released in October 2015.\n" +
                        "Marshmallow primarily focuses on improving the overall user experience of Lollipop, introducing a new permissions architecture, new APIs for contextual assistants (a feature notably leveraged by \"Now On Tap\"—a new capability of the Google searching by contextualizing an app into a simpler interface by Google Now), a new power management system that reduces background activity when a device is not being physically handled, native support for fingerprint recognition and USB Type-C connectors, the ability to migrate data and applications to a microSD card and use it as primary storage, and other internal changes.\n" +
                        "As of September 2016, 18.7% of devices accessing Google Play run Android 6.0.\n"));

        mAdapter.notifyDataSetChanged();
    }

    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private GestureDetector gestureDetector;
        private MainActivity.ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final MainActivity.ClickListener clickListener) {
            this.clickListener = clickListener;
            gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }

                @Override
                public void onLongPress(MotionEvent e) {
                    View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
                    if (child != null && clickListener != null) {
                        clickListener.onLongClick(child, recyclerView.getChildPosition(child));
                    }
                }
            });
        }

        @Override
        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {

            View child = rv.findChildViewUnder(e.getX(), e.getY());
            if (child != null && clickListener != null && gestureDetector.onTouchEvent(e)) {
                clickListener.onClick(child, rv.getChildPosition(child));
            }
            return false;
        }

        @Override
        public void onTouchEvent(RecyclerView rv, MotionEvent e) {
        }

        @Override
        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

        }
    }
}
