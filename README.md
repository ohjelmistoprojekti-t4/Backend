# Tiimi 4 REST API Dokumentaatio

[Linkki apiin](https://team4back.herokuapp.com/api/)<br>
[Linkki react-sovellukseen joka käyttää tätä apia](https://team4front.herokuapp.com/)

## DATABASE
![Luokkakaavio](img/luokkakaavio-v1_4.png?raw=true "Title")

#### Taulujen nimet:
**questions** -- (Kysymys-objektit),<br>
**options** -- (Kysymyksissä käytetyt vaihtoehto-objektit),<br> 
**surveys** -- (Kysely-objektit),<br> 
**userAnswers** -- (Käyttäjän vastaus kysymykseen -objektit),<br>
**answerSets** -- (Objektit, joihin tallennetaan käyttäjän vastaukset sekä vastaajan sessio-objekti),<br> 
**uniqueUserSessions** -- (Vastaajan sessio-objektit)<br>

## GET
#### Spring Data REST vakiokäytännöt
/api&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -- Näyttää kaikki taulut<br>
/api/**taulunnimi**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -- Näyttää taulukohtaisen datan ja/tai linkit liittyviin tauluihin<br><br>
Käyttöesimerkki: /api/questions<br>
**Palauttaa:**<br>
```json
{
  "_embedded" : {
    "questions" : [ {
      "id" : 3062,
      "question" : "avoin1",
      "type" : 3,
      "survey" : {
        "id" : 3061,
        "name" : "Kysely1"
      },
      "_links" : {
        "self" : {
          "href" : "https://team4back.herokuapp.com/api/questions/3062"
        },
        "question" : {
          "href" : "https://team4back.herokuapp.com/api/questions/3062"
        },
        "answers" : {
          "href" : "https://team4back.herokuapp.com/api/questions/3062/answers"
        },
        "refQuestionSurvey" : {
          "href" : "https://team4back.herokuapp.com/api/questions/3062/refQuestionSurvey"
        },
        "options" : {
          "href" : "https://team4back.herokuapp.com/api/questions/3062/options"
        }
      }
    }, {
    ... seuraavan kysymyksen data 
    }, jne....
```
<br>
    
#### Custom GET endpoint
**/getUserAnswerBySurvey/{id}** -- 
Voi hakea kaikki tiettyyn kyselyyn liitetyt käyttäjien vastaukset<br><br>

    

## POST
#### Spring Data REST vakiokäytännöt
/api/**taulunnimi** &nbsp;&nbsp;&nbsp;&nbsp; --&nbsp;&nbsp;&nbsp;&nbsp; Luo objektin tietokantaan konstruktorien mukaisesti<br>
#### Custom POST endpoint

**/addQuestion** voi lisätä kysymyksen sekä vaihtoehdot samanaikaisesti muodossa:<br>
```
{
	"question" : "Kysymys01",
	"survey" : {
		"surveyId" : 1,
		"name" : "Survey01"
	},
	"type" : 1
	"options" : {
		"option1": "Kyllä",
		"option2" : "Ehkä",
		"option3" : "Ei"
	}
}
```

**HUOM** type attribuutti on määritelty seuraavanlaisesti:<br><br>
1 = radio-monivalinta,<br>
2 = checkbox-monivalinta,<br>
3 = vapaamuotoinen tekstikenttäkysymys.
<br><br>

## PUT
#### Spring Data REST vakiokäytännöt
/api/**taulunnimi** &nbsp;&nbsp;&nbsp;&nbsp; --&nbsp;&nbsp;&nbsp;&nbsp;Lähettämällä uuden objektin voi muokata olemassa olevaa<br><br>
#### Custom PUT endpoint
**/putQuestion/id** voi muokata sekä kysymystä, että vaihtoehtoja samalla kutsulla muodossa:<br>
```
{
    "id": 4,
    "question": "Ollakko vai eikö olla?",
    "type": 1,
	"options": [
		{
			"optionid": 9,
			"option" : "Siinäpä"
		},
		{
			"optionid": 10,
			"option" : "Vasta"
		},
		{
			"optionid": 11,
			"option" : "Pulma"
		}
	]
}
```
<br><br>

## DELETE
#### Spring Data REST vakiokäytännöt
/api/**taulunnimi**/{id}&nbsp;&nbsp;&nbsp;&nbsp; --&nbsp;&nbsp;&nbsp;&nbsp; Poistaa objektin tietokannasta id:n perusteella<br><br>


##
