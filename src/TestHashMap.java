import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class TestHashMap {

    class PersonInfo {
        String mFirstName;
        String mLastName;
        String mUUID;
    
        public PersonInfo(String mFirstName, String mLastName
        		, String mUUID) {
			super();
			this.mFirstName = mFirstName;
			this.mLastName = mLastName;
			this.mUUID = mUUID;
		}

		@Override
        public boolean equals(Object o) {

        	if ( o != null && o instanceof PersonInfo) {
        		
        		PersonInfo that = (PersonInfo) o;
        		if (this.mFirstName.equals(that.mFirstName)
        				&& this.mLastName.equals(that.mLastName)
        				&& this.mUUID.equals(that.mUUID) ) {
        			return true;
        		} 
        	}
        	return false;
        }

        @Override
        public int hashCode() {
        	int hash = 17;
        	hash = 31 * hash + this.mFirstName.hashCode();
        	hash = 31 * hash + this.mLastName.hashCode();
        	hash = 31 * hash + this.mUUID.hashCode();
        	return hash;
     
        }
        
    }
    
    private Map<PersonInfo,Boolean> mStore;

    public void addPersonInfo (String mFirstName
            ,String mLastName,String mUUID) {
    	  PersonInfo pInfo = new PersonInfo(mFirstName,mLastName,mUUID);
    	  mStore.put(pInfo, true);
    }
    
    public void showAllPeoples () {

    	Iterator itertor = mStore.keySet().iterator();
    	while (itertor.hasNext()) {
    		 PersonInfo pII = (PersonInfo) itertor.next();
    		 System.out.println(pII.mFirstName + ":"
    		 		+ "" + pII.mLastName + ":" + pII.mUUID);
    	}
    }
    
    TestHashMap () {
        mStore = new HashMap<PersonInfo,Boolean> ();
    }


    public static void main (String args[] ) {

    	TestHashMap testMap = new TestHashMap();
        testMap.addPersonInfo ("HARI","SADU","7777");
        testMap.addPersonInfo ("HARI","SADU","7777");
        testMap.addPersonInfo ("HARI1","SADU","7777");
        testMap.addPersonInfo ("HARI2","SADU","7777");
        testMap.addPersonInfo ("HARI3","SADU","7777");
        testMap.showAllPeoples();
    	
    }




}
