package cucumber;


import apiEngine.EndPoints;
import enums.Context;

public class TestContext {

    private final String BASE_URL = "https://bookstore.toolsqa.com";
    private final String USER_ID = "b1d5ab34-a6d6-44d5-9297-f4cca62b85bd";

    private EndPoints endPoints;
    private ScenarioContext scenarioContext;

    public TestContext() {
        endPoints = new EndPoints(BASE_URL);
        scenarioContext = new ScenarioContext();
        scenarioContext.setContext(Context.USER_ID, USER_ID);
    }

    public EndPoints getEndPoints() {
        return endPoints;
    }

    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }

}