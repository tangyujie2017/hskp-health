package cn.tz.www.admin.controller.service.req;

/**
 * Created by zzc on 16/11/2016.
 */
public class UpdateReq<U> {

  private U details;

  public UpdateReq(U details) {
    this.details = details;
  }

  public U getDetails() {
    return details;
  }

  public void setDetails(U details) {
    this.details = details;
  }

}
