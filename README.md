# Backend

[API link here](https://team4back.herokuapp.com/api/)

## GET  
/api -- kaikki taulut<br>
/api/**taulunnimi** ilman hipsuja<br>
Taulujen nimet: questions, options, surveys, userAnswers, answerSets uniqueUserSessions
## POST
/addQuestion voi lisätä kysymyksen muodossa:<br>
{
    "question" : "Kysymys",<br>
    "survey" : {<br>
        "surveyId" : 1,<br>
        "name" : "Testisurvey1"<br>
    },<br>
    "type" : 1<br>
    "options" : {<br>
        "option1": "Kyllä",<br>
        "option2" : "Ehkä",<br>
        "option3" : "Ei"<br>
    }<br>
}

**HUOM** type attribuutti on määritelty seuraavanlaisesti: 1 = radio-monivalinta, 2 = checkbox-monivalinta ja 3 = vapaamuotoinen kysymys/teksti kysymys.

## PUT
/putQuestion/id

## DELETE
/api/**taulunnimi**/id

## Custom endpoints
/getUserAnswerBySurvey/id

Voi hakea kaikki kyselyn vastaukset per. käyttäjä Id:n perusteella