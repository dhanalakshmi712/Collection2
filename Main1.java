import java.util.Comparator;
 
public class TeamComparator implements Comparator<Team> {
 
                @Override
              public int compare (Team t1, Team t2) {
                                return t1.match.compareTo(t2.match);
                }
}
public class Main implements Comparator {
	public static void main(String args[])
	{
		 List<Team> l=new ArrayList<>();
         l.add(new Team("Chennai super Kings ",132L));
         l.add(new Team("Royal Challengers Bangalore ",139L));
         l.add(new Team("Delhi Daredevils ",131L));
    
        
         Collections.sort(l,new NameComparator());
         for(Team t:l)
                         System.out.println(t);
	}

}
import java.util.*;
 public class Team {
		 
		  String name;
		  Long numberofmatch;
		public Team(String name,Long match) {
		                super();
		                this.name = name;
		                this.numberofmatch = match;
		               
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getNumberofmatch() {
			return numberofmatch;
		}
		public void setNumberofmatch(Long numberofmatch) {
			this.numberofmatch = numberofmatch;
		}
		
		 
		}


