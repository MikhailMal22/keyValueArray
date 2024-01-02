# keyValueArray
 A simple system that stores an ordered collection of key-value entries via an ArrayList. In a any entry, each key is a string and each value is an integer. Entries are sorted in an alphabetical order of their keys. No entries are allowed to have the same key.
 A special infoSystem method is implemented, that enables the user to interact with the list via commands.
 
 Here is a list of commands in the infosystem:
 size: returns size of the list.
 
 isEmpty: returns true if the list is empty, returns false otherwise
 
 get: prompts user to enter a key in order to retrive its value. If the key is in the list, its value will be displayed. (Example: user enters key "abcd" and it returns its value 1234)
 
 put: promts user to enter a string and a number, in order to create a new key-value pair. If the key with the same value as the new key-value pair already exists, its value will simply be updated. Otherwise a new key-value pair will be inserted in the list.

remove: promts user to enter a string, in order to retrive an entry with that key to remove it. If the entry is found, it's key and value will be displayed and the entry will be reomoved from the list. 

keySet: returns a string array of all keys in the list.

values: returns an integer array of all values in the list.

entrySet: returns a list attribute, acting as a getter method.

exit: exits the system.
 
