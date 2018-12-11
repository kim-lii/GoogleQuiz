package kimli.googlequiz;

public class Questions {

    public String questions[] = {
            "Can you die from eating too much",
            "Should I get a",
            "I wish I were a",
            "College is",
            "What would happen if I",
            "I swallowed a",
            "McDonalds vs",
            "Is it possible to",
            "Chocolate flavored",
            "Country music is",
            "Is duct tape safe for",
            "Facebook is",
            "How to draw a",
            "Do fish ever",
            "Should I quit",
            "I need help with",
            "I want to buy a",
            "What happened to",
            "Can I perform my own",
            "How to get out of",
            "Why did they build the",
            "Is it weird to like",
            "Can you eat",
            "The Great",
            "Giraffes are",
            "When is the next",
            "Has a dog ever been",
            "Do all celebrities have",
            "Poems about",
            "Can you deep fry",
            "How to get rich off",
            "How to grow",
            "Sparkling",
            "Can the government control",
            "Global warming is",
            "I ate an entire",
            "Pictures of",
            "How to tie a",
            "Hats for",
            "Sitcom about",
            "How do you make",
            "My lucky number is",
            "How to build a"
    };

    public String choices[][] = {
            {"chicken nuggets", "weed", "salt", "cheese", "weed"},
            {"flu shot", "divorce", "tattoo", "perm", "flu shot"},
            {"carrot","bar of soap","baller","princess", "bar of soap"},
            {"my life","too hard","too expensive","a waste of time", "a waste of time"},
            {"touched lava","drank bleach","only ate ramen","died", "died"},
            {"bug", "fly", "penny", "tooth", "fly"},
            {"Wendys", "Chicago", "Taco Bell", "Burger King", "Burger King"},
            {"fly", "multitask", "live on Mars", "get super powers", "fly"},
            {"whiskey", "coffee", "marshmallows", "gum", "coffee"},
            {"trash", "dead", "the same", "the best", "dead"},
            {"skin", "rats", "chargers", "fish", "fish"},
            {"down", "not a diary", "bad", "dead", "down"},
            {"rose", "dog", "dragon", "person", "dog"},
            {"get thirsty", "drown", "sleep", "blink", "sleep"},
            {"YouTube", "my sport", "my job", "social media", "my job"},
            {"Christmas", "my homework", "math", "my resume", "Christmas"},
            {"new car", "house", "dog", "timeshare", "house"},
            {"me", "Kim Kardashian", "Vine", "Monday", "Vine"},
            {"liposuction", "background check", "wedding", "home inspection", "home inspection"},
            {"debt", "jury duty", "the friend zone", "group text", "debt"},
            {"Titanic", "pyramids", "Golden Gate Bridge", "Berlin Wall", "pyramids"},
            {"anime", "feet", "ASMR", "k-pop", "ASMR"},
            {"hedge apples", "shrimp when pregnant", "raw eggs", "acorns", "acorns"},
            {"Gatsby", "Depression", "Wall of China", "Lakes", "Gatsby"},
            {"endangered", "heartless creatures", "selfish", "fake", "heartless creatures"},
            {"Super Bowl", "solar eclipse", "full moon", "leap year", "full moon"},
            {"hit by lightning", "cloned", "to the moon", "knighted", "knighted"},
            {"to sell their souls", "stylists", "iPhones", "to join the Illuminati", "to sell their souls"},
            {"life", "love", "nature", "death", "love"},
            {"bacon", "an egg", "water", "with olive oil", "water"},
            {"rapping", "Bitcoin", "stocks", "YouTube", "YouTube"},
            {"a beard", "taller", "potatoes", "succulents", "a beard"},
            {"juice", "water", "wine", "cider", "water"},
            {"freedom of speech", "the media", "the weather", "your mind", "the weather"},
            {"fake", "caused by", "natural", "a hoax", "a hoax"},
            {"pizza", "bag of chips", "cake", "box of cereal", "pizza"},
            {"Lady Gaga", "bed bugs", "dogs", "puppies", "bed bugs"},
            {"scarf", "slip knot", "tie", "knot", "tie"},
            {"babies", "women", "big heads", "men", "men"},
            {"aliens", "the 80s", "alaska", "teachers", "aliens"},
            {"pumpkin seeds", "slime", "jello shots", "eggnog", "slime"},
            {"7", "13", "4", "454", "4"},
            {"snowman", "resume", "website", "computer", "computer"}
    };

    public String getQuestion(int n){
        String question = questions[n];
        return question;
    }

    public String getFirst(int n){
        String option = choices[n][0];
        return option;
    }

    public String getSecond(int n){
        String option = choices[n][1];
        return option;
    }

    public String getThird(int n){
        String option = choices[n][2];
        return option;
    }

    public String getFourth(int n){
        String option = choices[n][3];
        return option;
    }

    public String getAnswer(int n){
        String answer = choices[n][4];
        return answer;
    }

    public int getSize() {
        return questions.length;
    }

}
