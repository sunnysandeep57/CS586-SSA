Pipe Classes/
    Buffer Classes 
        list read(){   
            if buffer is empty then         
                wait until the buffer is not empty         
                delete list from buffer 
                return list  
            ENDIF   
        } 
        write(list){  
            put list into the buffer 
        } 
    }

    Class Filter1 {
        SA_buffer *sab
        readStudentAnswer(){
            while(1){
                // Read student test answers in to SA
                sab -> write(SA)
            }

        }
    }

    Class Filter2 {
        CA_buffer *cab
        readCorrectAnswer(){
            while(1){
                // Read Correct answers in to CA
                cab -> write(CA)
            }

        }
    }

    Class Filter3 {
        SA_buffer *sab
        CA_buffer *cab
        G_buffer *gb
        SGI_buffer *sgib
        calculateGrades(){
            while(1){
                CA = cab -> read()
                SA = sab -> read()
                gb -> write(G)
                sgib -> write(SGI)
            }

        }
    }

    Class Filter4 {
        DSNG_buffer *dsngb
        printGradeList(){
            while(1){
                DSNG = dsngb -> read()      // Print sorted grade list
            }
        }
    }

    Class Filter5 {
        G_buffer *gb
        GS_buffer *gsb
        computeStatistics(){   
            while(1){
                G = gb -> read()            // Compute grade statistics and load into GS objects
                gsb -> write(GS)
            }
        }
    }

    Class Filter9 {
        GS_buffer *gsb
        reportStatistics(){  
            while(1){
                GS = gsb -> read()          // report grade statistics
            }
        }
    }

    Class Filter7 {
        SNI_buffer *snib
        readStudentList(){ 
            while(1){
                snib -> write(SNI)
            }
        }
    }

    Class Filter6 {
        SNI_buffer *snib
        SGI_buffer *sgib
        SNG_buffer *sngb
        mapNameGrades(){
            while(1){
                SGI = sgib -> read()
                SNI = snib -> read()
                sngb -> write(SNG)
            }

        }
    }

    Class Filter8 {
        SNG_buffer *sngb
        DSNG_buffer *dsngb
        sortGradeList(){
            while(1){
                SNG = sngb -> read()
                dsngb -> write(DSNG)
            }

        }
    }
