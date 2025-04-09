package de.data_experts.sweverifier.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Task {

    @JsonIgnore
    private int taskNumber;

    @JsonProperty("instance_id")
    @JsonAlias("Instance_id")
    private String instanceId;

    @JsonProperty("repo")
    @JsonAlias("Repo")
    private String repo;

    @JsonProperty("commit")
    private String commit;

    @JsonProperty("Base_commit")
    private String baseCommit;

    @JsonProperty("issue_title")
    private String issueTitle;

    @JsonProperty("issue_body")
    private String issueBody;

    @JsonProperty("test_targets")
    private List<String> testTargets;

    @JsonProperty("patch")
    @JsonAlias("Patch")
    private String patch;

    @JsonProperty("Created_at")
    private String createdAt;

    @JsonProperty("example_index")
    private int exampleIndex;

    @JsonProperty("difficulty")
    private String difficulty;

    @JsonProperty("Environment_setup_commit")
    private String environmentSetupCommit;

    @JsonProperty("FAIL_TO_PASS")
    private String failToPass;

    @JsonProperty("Hints_text")
    private String hintsText;

    @JsonProperty("PASS_TO_PASS")
    private String passToPass;

    @JsonProperty("Problem_statement")
    private String problemStatement;

    @JsonProperty("Test_patch")
    private String testPatch;

    @JsonProperty("Version")
    private String version;

    // === Getter & Setter ===

    @JsonProperty("git_clone")
    public String getGitCloneCommand() {
        if (repo != null && baseCommit != null) {
            String repoUrl = "https://github.com/" + repo + ".git";
            String repoName = repo.contains("/") ? repo.split("/")[1] : repo;
            return "git clone " + repoUrl + " && cd " + repoName + " && git checkout " + baseCommit;
        }
        return null;
    }

    @JsonProperty("taskNumber")
    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public String getBaseCommit() {
        return baseCommit;
    }

    public void setBaseCommit(String baseCommit) {
        this.baseCommit = baseCommit;
    }

    public String getIssueTitle() {
        return issueTitle;
    }

    public void setIssueTitle(String issueTitle) {
        this.issueTitle = issueTitle;
    }

    public String getIssueBody() {
        return issueBody;
    }

    public void setIssueBody(String issueBody) {
        this.issueBody = issueBody;
    }

    public List<String> getTestTargets() {
        return testTargets;
    }

    public void setTestTargets(List<String> testTargets) {
        this.testTargets = testTargets;
    }

    public String getPatch() {
        return patch;
    }

    public void setPatch(String patch) {
        this.patch = patch;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public int getExampleIndex() {
        return exampleIndex;
    }

    public void setExampleIndex(int exampleIndex) {
        this.exampleIndex = exampleIndex;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getEnvironmentSetupCommit() {
        return environmentSetupCommit;
    }

    public void setEnvironmentSetupCommit(String environmentSetupCommit) {
        this.environmentSetupCommit = environmentSetupCommit;
    }

    public String getFailToPass() {
        return failToPass;
    }

    public void setFailToPass(String failToPass) {
        this.failToPass = failToPass;
    }

    public String getHintsText() {
        return hintsText;
    }

    public void setHintsText(String hintsText) {
        this.hintsText = hintsText;
    }

    public String getPassToPass() {
        return passToPass;
    }

    public void setPassToPass(String passToPass) {
        this.passToPass = passToPass;
    }

    public String getProblemStatement() {
        return problemStatement;
    }

    public void setProblemStatement(String problemStatement) {
        this.problemStatement = problemStatement;
    }

    public String getTestPatch() {
        return testPatch;
    }

    public void setTestPatch(String testPatch) {
        this.testPatch = testPatch;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
