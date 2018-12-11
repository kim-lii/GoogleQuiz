package kimli.googlequiz;

public class Questions {

    public String questions[] = {
            "Can you die from eating too much",
            "Should I get a",
            "I wish I were a",
            "College is",
            "What would happen if I",
//            "",
//            "",
//            "",
//            "",
//            "",
//            "",
//            "",


    };

    public String choices[][] = {
            {"chicken nuggets", "weed", "salt", "cheese", "weed"},
            {"flu shot", "divorce", "tattoo", "perm", "flu shot"},
            {"carrot","bar of soap","baller","princess", "bar of soap"},
            {"my life","too hard","too expensive","a waste of time", "a waste of time"},
            {"touched lava","drank bleach","only ate ramen","died", "died"},

    };

    public String getQuestion(int n){
        String question = questions[n];
        return question;
    }

    public String getFirst(int n){
        String choice = choices[n][0];
        return choice;
    }

    public String getSecond(int n){
        String choice = choices[n][1];
        return choice;
    }

    public String getThird(int n){
        String choice = choices[n][2];
        return choice;
    }

    public String getFourth(int n){
        String choice = choices[n][3];
        return choice;
    }

    public String getAnswer(int n){
        String answer = choices[n][4];
        return answer;
    }

}
