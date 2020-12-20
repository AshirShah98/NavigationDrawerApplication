package com.example.navigationdrawerapplication;

public class questionSet {

    public String myQuestions[] = {
            "Using Microsoft word we can simply ___",
            "The Binary Coded Decimal (BCD) uses",
            "Which of the following is billionth of a second?",
            "The two kinds of main memory are",
            "RAM is also called as",
            "Internal hard disk is",
            "The main memory of computer is also called as",
            "How much data can be stored in a CD?",
            "CD-ROM stands for",
            "_____ has the shortest access times."
    };


    private String myChoices[][] = {

            {"Paste picture","Type","Format a text","All the above functions"},
            {"6 bits","8 bits","16 bits","32 bits"},
            {"Microsecond","Nanosecond","Terabyte","Gigabyte"},
            {"CDs and DVDs","RAM and ROM","Primary and secondary","Direct and sequential"},
            {"Virtual memory","Volatile memory","Non volatile memory","Cache memory"},
            {"Removable but not fixed","Removable","Not fixed","Fixed"},
            {"Hard-disk","Primary storage","Secondary storage","Internal memory"},
            {"300 MB","400 MB","670 MB","700 MB"},
            {"Compactable Disc Read Only Memory","Compact Data Read Only Memory","Compactable Read Only Memory","Compact Disc Read Only Memory"},
            {"Virtual Memory","Secondary Memory","Cache Memory","All of the above"}
    };

    private String myChoicesAns[] = {
            "All the above functions",
            "6 bits",
            "Nanosecond",
            "RAM and ROM",
            "Volatile memory",
            "Fixed",
            "Primary storage",
            "700 MB",
            "Compact Disc Read Only Memory",
            "Cache Memory"
    };

    public String getQuestion(int a)
    {
        return (myQuestions[a]);
    }

    public String getChoice1(int a)
    {
        return (myChoices[a][0]);
    }

    public String getChoice2(int a)
    {
        return (myChoices[a][1]);
    }

    public String getChoice3(int a)
    {
        return (myChoices[a][2]);
    }

    public String getChoice4(int a)
    {
        return (myChoices[a][3]);
    }

    public String getCorrectAns(int a)
    {
        return (myChoicesAns[a]);
    }
}
