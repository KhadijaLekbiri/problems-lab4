package student;

public class Subject {
    private int id;
    private String code;
    private String title;

    public String properTitle(String title){
        String[] words = title.split(" ");
        for (int i = 0; i < words.length ;i++) {
            words[i] = words[i].substring(0,1).toUpperCase()+words[i].substring(1);
        }
        return String.join("",words);
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isIntroCourse(){
        return this.title.toLowerCase().contains("intro") || this.code.toLowerCase().startsWith("INTRO-");
    }

    public String syllabusLine(Instrustor instrustor ){
        StringBuilder res = new StringBuilder();
        res.append(this.code+" - ");
        res.append(this.title+" - ");
        res.append("(Instructor: "+instrustor.secondName+" "+instrustor.firstName);
        return res.toString();
    }

}
