# Activity-Fragment-Lifecycle

Android Activity & Fragment Lifecycle

Activity LifeCycle
Whenever your activity is launched the it call following methods:
onCreate()
onStart()
onResume()

After the execution of 1st condition there are some possible conditions then can execute according to user activities

Condition 1: When you press Back Button then it calls
onPause()
onStop()
onDestroy()

Condition 2, 3: When user press Home Button or Recent Apps button
onPause()
onStop()

When User is moving One Activity to Another
onCreate() 1
onStart() 1
onResume() 1
onPause() 1
onCreate() 2
onStart() 2
onResume() 2
onStop() 1

Now user is in 2nd Activity. There are again 4 conditions that can be executed by user.
Condition 1: When you press Back Button then it calls
onPause() 2
onRestart() 1
onStart() 1
onResume() 1
onStop() 2
onDestroy() 2

Now user is in 1st Activity

Condition 2, 3: When You press Home Button or apps button
onPause()
onStop()
Condition 4: If finish() is call while moving one activity to another then following methods are executed.
Moving One Activity to Another Activity
Intent intent = new Intent(MainActivity.this, NextActivity.class);
startActivity(intent);
finish();

onCreate() 1
onStart() 1
onResume() 1
onPause() 1
onCreate() 2
onStart() 2
onResume() 2
onStop() 1
<font color="red">onDestroy() 1</font>   // This method call because we have used finish()
