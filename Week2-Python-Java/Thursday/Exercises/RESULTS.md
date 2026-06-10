# Linear vs binary — results

## Round 1 (N = 100000)

| Algorithm | Time (ms) | Notes |
|-----------|-----------|-------|
| Linear    | 24.0000    |       |
| Binary    | 0.0000    |       |

## Round 2 (N = 5000000)

| Algorithm | Time (ms) | Notes |
|-----------|-----------|-------|
| Linear    | 1.0000    |       |
| Binary    | 0.0000    |       |

## Big-O discussion
Before testing I thought that the linear would be slower than the bineary search and round 2 would be slower than round 1

But after testing it was revield that linear was infact slower than bineary but round 2 even though it had more elements was still faster than round 1

It turns out that there are a lot of different variables that go into the programs run time
There is what index the target is located at
The initital JVM warmup time to fetch the relavant resources
And what information is alread in cache
