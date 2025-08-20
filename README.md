
<p align="center">
<img height="200" src='https://github.com/fornewid/Neumorphism/blob/main/art/preview.png'/>
</p>

<h1 align="center">smtunnel arman in Android</h1><br/>
<p align="center">
  This is the experimental codes to build smtunnel arman designs in Android.<br/>
  Not a library. Just sample project now.<br/>
  <br/>
</p>
</br>

<p align="center">
<a href="https://opensource.org/licenses/Apache-2.0"><img src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
<a href='https://developer.android.com'><img src='http://img.shields.io/badge/platform-android-green.svg'/></a>
</p>
<br/>

<h2 align="center">Preview</h2>
<h4 align="center">Light    |    Dark</h4>
<p align="center">
<img width="300" src="https://github.com/fornewid/Neumorphism/blob/main/art/preview_light.gif"/> <img width="300" src="https://github.com/fornewid/Neumorphism/blob/main/art/preview_dark.gif"/>
</p>

## Dependency

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
```gradle kts
allprojects {
    repositories {
        maven { url = uri("https://jitpack.io") }
    }
}
```


Then, add the library to your module `build.gradle`
```gradle
dependencies {
    implementation 'com.github.armanmiah34:smtunnel_arman:6.0'
}
```

```old update gradle kts
dependencies {
    implementation ("com.github.armanmiah34:smtunnel_arman:5.0")
}
```

## Features
- Draw a shadow background on widgets for Arman.
  Supported on the following widgets:
  - ViewGroup: CardView
  - View: Button, FloatingActionButton, ImageView
- Draw a text shadow on TextView for Neumorphism.

> 

## Usage
There is a [sample](https://github.com/fornewid/neumorphism/tree/main/sample) provided which shows how to use the library:

```xml

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:id="@+id/main"
    android:layout_height="match_parent"
    tools:context="com.smtunnel.armanapp.MainActivity">

    <com.smtunnel.arman.ArmanCardView
        android:id="@+id/edittext_card"
        style="@style/Widget.Neumorph.CardView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginStart="48dp"
        android:layout_marginTop="24dp"
        android:layout_marginEnd="48dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <EditText
            android:id="@+id/edittext"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="12dp"
            android:layout_marginEnd="12dp"
            android:hint="Enter something"
            android:singleLine="true" />

    </com.smtunnel.arman.ArmanCardView>

    <com.smtunnel.arman.NeumorphTextView
        android:id="@+id/textview"
        style="@style/Widget.Neumorph.TextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="48dp"
        android:text="Arman"
        android:textColor="@color/background"
        android:textSize="40sp"
        android:textStyle="bold"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/edittext_card" />

    <com.smtunnel.arman.ArmanCardView
        android:id="@+id/flat_card"
        style="@style/Widget.Neumorph.CardView"
        android:layout_width="150dp"
        android:layout_height="150dp"
        android:layout_marginTop="48dp"
        app:layout_constraintEnd_toStartOf="@id/pressed_card"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/textview" />

    <com.smtunnel.arman.ArmanCardView
        android:id="@+id/pressed_card"
        style="@style/Widget.Neumorph.CardView"
        android:layout_width="150dp"
        android:layout_height="150dp"
        android:layout_marginTop="48dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@id/flat_card"
        app:layout_constraintTop_toBottomOf="@id/textview"
        app:neumorph_shapeType="pressed" />

    <androidx.constraintlayout.widget.Barrier
        android:id="@+id/card_barrier"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:barrierDirection="bottom"
        app:constraint_referenced_ids="flat_card,pressed_card" />

    <com.smtunnel.arman.NeumorphImageButton
        android:id="@+id/flat_image_view"
        style="@style/Widget.Neumorph.ImageButton"
        android:layout_width="88dp"
        android:layout_height="88dp"
        android:layout_marginTop="48dp"
        android:scaleType="centerInside"
        android:src="@drawable/ic_daynight_sky"
        app:layout_constraintEnd_toStartOf="@id/pressed_image_view"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/card_barrier" />

    <com.smtunnel.arman.NeumorphImageButton
        android:id="@+id/pressed_image_view"
        style="@style/Widget.Neumorph.ImageButton"
        android:layout_width="88dp"
        android:layout_height="88dp"
        android:layout_marginTop="48dp"
        android:scaleType="centerInside"
        android:src="@drawable/ic_daynight_activity"
        app:layout_constraintEnd_toStartOf="@id/basin_image_view"
        app:layout_constraintStart_toEndOf="@id/flat_image_view"
        app:layout_constraintTop_toBottomOf="@id/card_barrier"
        app:neumorph_shapeType="pressed" />

    <com.smtunnel.arman.NeumorphImageButton
        android:id="@+id/basin_image_view"
        style="@style/Widget.Neumorph.ImageButton"
        android:layout_width="88dp"
        android:layout_height="88dp"
        android:layout_marginTop="48dp"
        android:scaleType="centerInside"
        android:src="@drawable/ic_daynight_food"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@id/pressed_image_view"
        app:layout_constraintTop_toBottomOf="@id/card_barrier"
        app:neumorph_shapeType="basin" />

    <com.smtunnel.arman.NeumorphFloatingActionButton
        style="@style/Widget.Neumorph.FloatingActionButton"
        android:layout_width="88dp"
        android:layout_height="88dp"
        android:layout_margin="24dp"
        android:scaleType="centerInside"
        android:src="@drawable/ic_filter"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:neumorph_shapeAppearance="@style/CustomShapeAppearance" />

    <com.smtunnel.arman.NeumorphButton
        android:id="@+id/button"
        style="@style/Widget.Neumorph.Button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="36dp"
        android:drawablePadding="8dp"
        android:text="Button"
        app:drawableEndCompat="@drawable/ic_right"
        app:drawableStartCompat="@drawable/ic_left"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <com.smtunnel.arman.NeumorphFloatingActionButton
        android:id="@+id/fab"
        style="@style/Widget.Neumorph.FloatingActionButton"
        android:layout_width="88dp"
        android:layout_height="88dp"
        android:layout_margin="24dp"
        android:scaleType="centerInside"
        android:src="@drawable/ic_filter"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>

```

```xml
<com.smtunnel.arman.ArmanCardView
    // Pre-defined style
    style="@style/Widget.Neumorph.CardView"

    // Set shadow elevation and colors
    app:neumorph_shadowElevation="6dp"
    app:neumorph_shadowColorLight="@color/solid_light_color"
    app:neumorph_shadowColorDark="@color/solid_dark_color"

    // Set light source
    app:neumorph_lightSource="leftTop|leftBottom|rightTop|rightBottom"

    // Set shape type and corner size
    app:neumorph_shapeType="{flat|pressed|basin}"
    app:neumorph_shapeAppearance="@style/CustomShapeAppearance"

    // Set background or stroke
    app:neumorph_backgroundColor="@color/background_color"
    app:neumorph_strokeColor="@color/stroke_color"
    app:neumorph_strokeWidth="@dimen/stroke_width"

    // Use a inset to avoid clipping shadow. (default=12dp)
    app:neumorph_inset="12dp"
    app:neumorph_insetStart="12dp"
    app:neumorph_insetEnd="12dp"
    app:neumorph_insetTop="12dp"
    app:neumorph_insetBottom="12dp"

    // Use a padding. (default=12dp)
    android:padding="12dp">

</com.smtunnel.arman.ArmanCardView>

<style name="CustomShapeAppearance">
    <item name="neumorph_cornerFamily">{rounded|oval}</item>
    <item name="neumorph_cornerSize">32dp</item>

    <!-- Or if wants different radii depending on the corner. -->
    <item name="neumorph_cornerSizeTopLeft">16dp</item>
    <item name="neumorph_cornerSizeTopRight">16dp</item>
    <item name="neumorph_cornerSizeBottomLeft">16dp</item>
    <item name="neumorph_cornerSizeBottomRight">16dp</item>
</style>
```

- #### LightSource
| LEFT_TOP | LEFT_BOTTOM | RIGHT_TOP | RIGHT_BOTTOM |
| :--: | :-----: | :---: | :---: |
| <img width="100" src="https://github.com/fornewid/Neumorphism/blob/main/art/lightSource_leftTop.png"/> | <img width="100" src="https://github.com/fornewid/Neumorphism/blob/main/art/lightSource_leftBottom.png"/> | <img width="100" src="https://github.com/fornewid/Neumorphism/blob/main/art/lightSource_rightTop.png"/> | <img width="100" src="https://github.com/fornewid/Neumorphism/blob/main/art/lightSource_rightBottom.png"/> |

- #### ShapeType
| FLAT | PRESSED | BASIN |
| :--: | :-----: | :---: |
| <img width="100" src="https://github.com/fornewid/Neumorphism/blob/main/art/shape_flat.png"/> | <img width="100" src="https://github.com/fornewid/Neumorphism/blob/main/art/shape_pressed.png"/> | <img width="100" src="https://github.com/fornewid/Neumorphism/blob/main/art/shape_basin.png"/> |

## License

```
Copyright 2020 SOUP

Licensed to the Apache Software Foundation (smtunnel arman) under one or more contributor
license agreements. See the NOTICE file distributed with this work for
additional information regarding copyright ownership. The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License. You may obtain a copy of
the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations under
the License.
```


