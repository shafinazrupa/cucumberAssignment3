$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/techfios.feature");
formatter.feature({
  "line": 1,
  "name": "Techfios Page",
  "description": "As a user I want to change the background color",
  "id": "techfios-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8392364000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Sky Blue Background",
  "description": "",
  "id": "techfios-page;sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Set SkyBlue background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the skyblue button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "TechfiosSteps.set_SkyBlue_background_button_exists()"
});
formatter.result({
  "duration": 214978700,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "TechfiosSteps.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 931516000,
  "status": "passed"
});
formatter.before({
  "duration": 5957549000,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "White Background Change",
  "description": "",
  "id": "techfios-page;white-background-change",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Set SkyWhite Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on the white button;",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "TechfiosSteps.the_background_color_will_change_to_white()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1113399000,
  "status": "passed"
});
});