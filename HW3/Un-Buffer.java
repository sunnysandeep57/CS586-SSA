Class Filter1 {
    Filter3 *f3;
    readStudentAnswer(){
        SA = reads List of Student Test Answers along with Students Id
        f3 -> calculateGrades(SA)
    }
}

Class Filter2 {
    Filter3 *f3;
    readCorrectAnswer(){
        CA = reads correct answers
        f3 -> writeCorrectAnswer(CA)
    }
}

Class Filter3 {
    CA ca
    Filter5 *f5;
    Filter8 *f8;
    writeCorrectAnswer(CA ca){
        this.ca = ca;
    }

    calculateGrades(SA sa){
        SGI = calculate Grades;
        G = SGI -> getGrades();
        f8 -> writeStudentList(SGI);
        f5 -> computeStatistics(G);
    }
}

Class Filter5 {
    Filter9 *f9;
    computeStatistics(G g){
        GS = grade statistics;
        f9 -> reportStatistics(GS);
    }
}

Class Filter9 {
    reportStatistics(GS gs){
    }
}


Class Filter7 {
    Filter6 *f6;
    readStudentList(){
        SNI = student list with names & ids;
        f6 -> writeStudentList(SNI);
    }
}

Class Filter6 {
    SNI sni;
    Filter8 *f8;
    writeStudentList(SNI sni){
        this.sni = sni;
    }
    mapNameGrades(SGI sgi){
        SGI = Student Name & Student Grades List
        f8 -> sortGradeList(SNG)
    }
}

Class Filter8 {
    Filter4 *f4;

    sortGradeList(SNG sng){
        DSNG dsng = sort(sng);
        f4 -> printGradesList(dsng)
    }
}

Class Filter4 {
    printGradesList(DSNG dsng){
        
    }
}
