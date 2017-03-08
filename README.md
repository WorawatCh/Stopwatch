# Stopwatch tasks by Worawat Chueajedton (5910545825) (*)
I ran the tasks on a lenovo ideapad y700, and got
these results:

|Task | Time|
|-----------------------------------------|-------:|
|Append 50,000 chars to String            | 0.986557 sec|
|Append 100,000 chars to String           | 3.164537 sec|
|Append 100,000 chars to StringBuilder    | 0.001971 sec|
|Add 1 billion double using array         | 1.318128 sec|
|Add 1 billion Double using object        | 5.869959 sec|
|Add 1 billion BigDecimal using object    | 10.137580 sec|

## Explanation of Results
1. Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?
ans = when string want to add more string it will make a new storage to keep old string, newly add string and old one plus new one string(result string) so that is why dose appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?

2. Why is appending to StringBuilder so much different than appending to String?  What is happening to the String?
ans = lesson that why is appending to StringBuilder so much different than appending to String?  What is happening to the String? is StringBuilder has attribute char[] it is array and it will already make a length so if you append something it will add to it automatic but if you add something that has a length more than attribute length it will make a new one

3. Explain difference in time to sum double, Double, and BigDecimal.  Which is faster and why?
ans = the fastest is double. the second is Double. And the last one is BigDecimal. How it is difference, double is a primitive it is easily to add. Double is a wrapper class so when it have to add sometime it just like a box it has to open, get what inside to add something, put it in the box again and close it, that is why it take a long time.And BigDecimal is slowest because it has a many method and attribute.
