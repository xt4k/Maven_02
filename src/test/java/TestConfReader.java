public class TestConfReader {
    private String confFilePath;
    private String confFileName;
    private String paramName;
    private int paramRow;

    public TestConfReader(String confFilePath, String confFileName, String paramName, int paramRow) {
        this.confFilePath = confFilePath;
        this.confFileName = confFileName;
        this.paramName = paramName;
        this.paramRow = paramRow;
    }

    public void setConfFilePath(String confFilePath) {
        this.confFilePath = confFilePath;
    }

    public void setConfFileName(String confFileName) {
        this.confFileName = confFileName;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public int getParamRow() {
        return paramRow;
    }

    public void setParamRow(int paramRow) {
        this.paramRow = paramRow;
    }
}
