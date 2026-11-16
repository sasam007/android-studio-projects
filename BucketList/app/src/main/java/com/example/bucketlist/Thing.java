package com.example.bucketlist;

import androidx.annotation.DrawableRes;

public class Thing {
    final int imageThing;
    final String titleThing;

    public Thing(@DrawableRes int imageThing, String titleThing) {
        this.imageThing = imageThing;
        this.titleThing = titleThing;
    }

    public static class Experiences extends Thing {
        Experiences(@DrawableRes int imageThing, String titleThing) {
            super(imageThing, titleThing);
        }
    }

    public static class Places extends Thing {
        Places(@DrawableRes int imageThing, String titleThing) {
            super(imageThing, titleThing);
        }
    }
}
