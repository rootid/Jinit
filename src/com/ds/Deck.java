

//Each card 

class Card {

    String suite;
    Integer rank;
    Card (String aSuite,Integer rank) {
        this.suite = aSuite;
        this.rank = rank;
    }
}

class Game {

    List<Card> deck;
    String suite[] = {};
    String rank [] = {1,2,3,4,5,6,7,8,9,10,11,12,13};

    Game () {
        deck = new ArrayList<Card> ();
        for (int i=0;i<suite.length;i++) {
            for (int j=0;j<rank.length;j++) {
                deck.add(new Card(suite[i],rank[j]));
            }
        }
    }

    void doshuffle () {
        int len = deck.size();
        for (int i=0;i<len;i++) {
            int next = Math.random() % (len-1);
            swap(deck[i],deck[next]);
        }
    }



}
