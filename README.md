# Backend
## GET  
/api -- kaikki taulut
/api/'taulunnimi' ilman hipsuja  
Taulujen nimet: questions, options, surveys, userAnswers, answerSets uniqueUserSessions
## POST
/addQuestion voi lisätä kysymyksen muodossa:  
{
    "question" : "Kysymys",
    "survey" : {
        "surveyId" : 1,
        "name" : "Testisurvey1"
    },
    "type" : 1
    "options" : {
        "option1": "Kyllä",
        "option2" : "Ehkä",
        "option3" : "Ei" 
    }
}

**HUOM** type attribuutti on määritelty seuraavanlaisesti: 1 = radio-monivalinta, 2 = checkbox-monivalinta ja 3 = vapaamuotoinen kysymys/teksti kysymys.