# MessageView
A simple library to show custom Toast message for the success or error status. 
You can set sound if you want and you decide toast location on screen.
Example usages can be found in example project.

# Screen

<a href='https://postimg.cc/Y4qGtZ7J' target='_blank'><img src='https://i.postimg.cc/Y4qGtZ7J/Bottom.png' border='0' alt='Bottom'/></a>
<a href='https://postimg.cc/nsBFb1j6' target='_blank'><img src='https://i.postimg.cc/nsBFb1j6/Center.png' border='0' alt='Center'/></a>
<a href='https://postimg.cc/CZGg6L90' target='_blank'><img src='https://i.postimg.cc/CZGg6L90/Top.png' border='0' alt='Top'/></a>


# Feature
* You can decide toast message location on screen.
* You can set sound if you want.
* There are two different type of message type as error and success.

# Gradle
``` java
repositories {
    maven {
        url "https://jitpack.io"
    }
}
 ```
 ``` java
dependencies {
    implementation 'com.github.ozanurkn:MessageView:0.0.3'
}
 ```
 
 # Usage
 ``` java
   //set click listener
      findViewById(R.id.deneme).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MessageView.showErrorMessage(getContext(),getResources().getString(R.string.sample_text),true, Error.error_gets_in_the_way,State.TOP);
            }
        });
        
```       
