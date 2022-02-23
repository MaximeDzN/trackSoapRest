package eu.ensup.domain;

public class Response {
    private Integer status;
    private String reason;

    public Response(Integer status, String reason) {
        this.status = status;
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                '}';
    }
}
