/* Nam Phu Nguyen (Logan)
   IT220-JAVA II 
   Programing Assignment
 */ 
import java.util.*;


public class Relatives
{
    //  Map instance variable map
    private Map<String,Set<String>> map;

    // TODO: finish the constructor method which instantiates the map as aTreeMap
    public Relatives()
    {
        map = new TreeMap<>();
    }

    // precondition: line contains a personname and a relativename separated by a space
    // ex. line = "Almas Brian"
    // postcondition: the person(Almas) is placed into the map as a key and the relative(Brian) is added
    // to the relative set for this person
    public void setPersonRelative(String line)
    {
        //TODO: Use the split method to break apart the person from his relative
        //For example: after the split method is called names[0] = "Almas"(person) and names[1] = "Brian" (relative)
        String[] names = line.split(",");
        String person = names[0];//key
        String relative = names[1]; //value going into a set

        //create a set variables
        Set<String> set;

        // TODO: if the map does NOT contain the person(key) like "Almas"
        //try using containsKey(Person)
        if (!(map.containsKey(person))) {
            //TODO: then create a new empty TreeSet for the person's relatives "so we can add "Brian"
            set = new TreeSet<>();
//            set.add(relative);
            //TODO: put the set into the map for this person
            map.put(person, set);
        }


        // TODO: outside the if, get the set of relatives for the person
        set = map.get(person);

        // TODO: add the relative to the set for this person
        set.add(relative);



    }

    // TODO:  This method returns a String represention of the Set of relatives for the passed in
    // person.  For example, if "Dot" is passed in for the person, then you should create a return
    // string containing "Chuck,Fred,Jason,Tom"
    public String getRelatives( String person)
    {
        String result=""; // empty string
        Set<String> set = map.get(person);
        for (String relative : set) {

            result +=relative + ",";

        }

        // use substring method to cut off last comma
        return result.substring(0,result.length()-1);
    }

    // The toString() returns a string representation for the entire contents of the map
    // listing
    public String toString()
    {
        String result="";
        // TODO:  for every person in the map keySet
        for (String person : map.keySet()) {
            // TODO: add this person to the return string with a "is related to "
            result += person + " is related to " +getRelatives(person) +"\n";

            // TODO: call getRelatives and add relatives for this person to return string and add newline

        }
        // return the string representation for the entire contents of the map listing
        return result;
    }
}
