# there is byte stream that uses input streams and output streams
# when using character streams you are using reader and writer

# in order to read the content of a file you use the read method
# it returns an in value and it keeps on reading until it reaches -1
# so you call it with while reader isn't -1  you keep on reading

# the method you use to write you use the write method

# the byte level is for low level data like images mp4

# but if you are reading a text file you use the character stream

# java used the consept of buffereing to reduce the amount of trips to the
# source you are reading from

# it keeps reading characters until the buffer is full and then goes to the 
# program

# this is compared to reading one char and going to the program and then reading
# another character

# _______________________________________________________________________________

# is there a way to write the state of object into a file--- Yes
# this is done through serialization (writing the state of object into file)
# this is done so it will survive a rerun, or computer reboot

# the oposite of this is deserialization

# inorder to implement this any class that we want to implement this needs to
# implement serialization
# it is a marker interface (has no interfaces)
