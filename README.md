# Threads

Hi Mr. Hartman,

From my observation, threads are like workers at a construction site 
that build something from a set of plans. Instead of one worker framing a wall with a hammer, 
you give three hammers to three workers and have them frame the wall at the same time, 
each worker following a different component of the plans for the wall. In this case, I played around with the print statements
such that the workers print "Hello from thread-# of processor #". It's similar to when 
I got my supercomputer to print "Hello from processor # of 12", in that case it was 12 cores 
rather than threads.

I've been experimenting with multithreading in Python with the 'threading' library 
so my system can collect data, analyze it, and make decisions from it faster. 
One of the main challenges has been trying to query and populate the same sqlite3 tables 
at the same time without the database locking. 
Once that's solved I will be able to run the system much more efficiently. 
I have a feeling that the problem is similar to what you were describing about how 
multiple workers can't all use one hammer at the same time, that creates a conflict. 
In this case, it might lead to data corruption, so I'll have to find some way to do it without that happening.
I'm still completely new to multithreading and supercomputing, 
I first got into them on the winter break along with using Linux
and I have so much more to learn and create with all of it. 

I look forward to seeing the code you wrote for MPI in Python and reverse engineer it
so I can understand it better, and hopefully implement what I've learned about it into my application.

Thanks,

Joseph