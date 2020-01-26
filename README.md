# Multithreading Exercise

This program is used to experiment and demonstrate the different methods of concurrency and thread-safing available. Two threads were created, once using the method of extending the Thread class and the other by implementing the Runnable interface.

---

Copy of task set:

1. Create a SharedCounter class which will have
 
* The instance variable counter
* getCounter method
* incrementCounter method(which will increment the counter first and then do assignment)

Increment the counter with no lock at the first go to see what is happrening. Try to make the program work correctly without lock by putting the threads to waiting state using different methods that puts the thread state to waiting/time-waiting. Later on try to make it mutually exclusive and memory visible.

2. In main()-Create 2 or more than two threads and assign the task of SharedCounter to them. Threads should be created using both ways of creation.

3. Record the answers by running it a number of times and infer from the trend(Inference to be written in the README in gitHub of the project). Also draw inference after making changes for implementing mutual exclusion and memory visibility(run this as well number of times to draw the inference from the trend.)

4. Submission-Upload to GitHub and share the link with me in teams. Have a proper readme file as well. 

---

This program has two threads running the incrementCounter method on the shared counter using a for loop with each thread running 5 increments (to increase the chance of detecting any data corruption). 

Without any locking, a race condition occurs on some runs. On the 5th attempt, the counter only incremented to 9 rather than 10 as both threads accessed the variable at '1' and incremented to 2. Output of a corrupted attempt is below:

Two 1

Two 2

Two 3

Two 4

Two 5

One 1

One 6

One 7

One 8

One 9

By making the method synchronized, this will mean that only one thread can run it at any one time, eliminating the missed increments (now commented out).

A third method is to use an AtomicInteger for the counter, which will give the variable volatile-like memory visibility and keep it thread-safe - whilst also being less expensive than synchonization (final state of program).
