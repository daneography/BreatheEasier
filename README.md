<!---
.______   .______       _______     ___   .___________. __    __   _______  _______     ___           _______. __   _______ .______      
|   _  \  |   _  \     |   ____|   /   \  |           ||  |  |  | |   ____||   ____|   /   \         /       ||  | |   ____||   _  \     
|  |_)  | |  |_)  |    |  |__     /  ^  \ `---|  |----`|  |__|  | |  |__   |  |__     /  ^  \       |   (----`|  | |  |__   |  |_)  |    
|   _  <  |      /     |   __|   /  /_\  \    |  |     |   __   | |   __|  |   __|   /  /_\  \       \   \    |  | |   __|  |      /     
|  |_)  | |  |\  \----.|  |____ /  _____  \   |  |     |  |  |  | |  |____ |  |____ /  _____  \  .----)   |   |  | |  |____ |  |\  \----.
|______/  | _| `._____||_______/__/     \__\  |__|     |__|  |__| |_______||_______/__/     \__\ |_______/    |__| |_______|| _| `._____|
It says BreatheEasier in Starwars font. If unclear, this is due to the smaller screen being viewed from.
--->
Primary(on this app): Dane Acena,South Carolina - Advancing Diversity in Aging Research, Benedict College, School of STEM, Mathematics and Computer Science Department
Mentors: Dr. Jenay Beer,PhD, Assistive Robotics and Technology Lab, College of Engineering and Computing, University of South Carolina;
Dr. Karen Kane McDonnell, PhD, RN, OCN: Lung Cancer Survivorship Research Program, College of Nursing, University of South Carolina

<!--WHAT IS THIS APP ABOUT?-->
This app aims to adapt BreatheEasier, a 9-week intervention into a smaprtphone application
using Mindfulness-Based Cancer Recovery(MBCR) 

<!--CURRENT GITHUB-->
    https://github.com/daneography/Breathe-Easier
    
<!--GETTING STARTED-->
BreathEasier, is a 'container app' that will enable users to be able to access materials from the BreatheEasier 9-week intervention. Users are able to access different intervention programs
    Mindfulness - this is the Weekly intevention that users will be able to perform. This is parallel to the intervention done in the 'center'; This can also contain the pratice assignments.
    Daily - Users will be able to track their usage.  Counts the #: of body scans, breathign exercises, breathing meditation, gentle movement, of love and kindness mediation..
    Communities - User will be able to interact with each other, ive feedback and encouragment. (Firebase might be the one..)
    Exercises - this will contain various exercises with instruction how to perform it. "Exercises" like body scan, breathign exercises, breathing meditation, gentle movement, of love and kindness mediation

At first usage of the app there will be a license agreement, then a cardview of tutorials, then the login/registration screen.
!!BUG: Once on the log-in screen, you will be able to close the app then open it again -> users are able to 'bypass' the 'security

TODO: Add testimonials to the navigation drawer.

Needs content CON may have to make the verbage:
LICENCE AGREEMENT

<!--PREREQUISITE-->
Android Studio 2.3.3
 
Go find out how to install this. Android SDK to run the emulator will also be needed.

This was primarily coded for Pixel XL


<!--INSTALLING-->

Either run an Android SDK emulator or run it in an Android Device that has Developer options on.


<!--DEPLOYMENTS?-->

Header ratio: 10:19 (1050x550)

Each separate section is an Activity (Empty), these activities have nothing in its layout just blank -> Initfrag() in this Activity to put the defualt fragment to show in the Activity

For instance, aboutActivity is an empty fragment with nothing in it. But the initFrag() implemented in it will show the aboutMainFragment as the default fragment/screen for the aboutActivity.

<!--DATABASE-->
The app uses retrofit to access a server. Currently, the server access only works on localhost. I used WAMP to create a "loopback virtual server?" on my computer.



<!--AUTHORS-->

<!--ACKNOWLEDGEMENT-->
Login/Registration Tutorial:    
    https://www.learn2crack.com/2016/04/android-login-registration-php-mysql-server.html
    https://www.learn2crack.com/2016/04/android-login-registration-php-mysql-client.html

Welcome Screen (Tutorial):
    http://www.androidhive.info/2016/05/android-build-intro-slider-app/


