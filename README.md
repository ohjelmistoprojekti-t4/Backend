# Backend
## GET  
/api -- kaikki taulut  return
/api/'taulunnimi' ilman hipsuja   return
Taulujen nimet: questions, options, surveys, userAnswers, answerSets uniqueUserSessions
## POST
/addQuestion voi lisätä kysymyksen muodossa:  return
{
    "question" : "Kysymys",  return
    "survey" : {  return
        "surveyId" : 1,  return
        "name" : "Testisurvey1"   return
    },   return
    "type" : 1    return
    "options" : {    return
        "option1": "Kyllä",   return
        "option2" : "Ehkä",   return
        "option3" : "Ei"     return
    }    return
}

**HUOM** type attribuutti on määritelty seuraavanlaisesti: 1 = radio-monivalinta, 2 = checkbox-monivalinta ja 3 = vapaamuotoinen kysymys/teksti kysymys.

## PUT

## DELETE