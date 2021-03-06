package www.aql.com.entity.response;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Jason on 2016/7/19.
 */
public class Route implements Parcelable {
    public long columnid;
    public String routeid;
    public String routename;
    public String routeimage;
    public String routearea;
    public String routearea_en;

    public UrlInfo urlinfo;

    public String marketprice;
    public String currentprice;
    public String routetime;
    public long hot;
    public String createtime;
    public String prepaidmoney;
    public int paytype;
    public long reviewnum;
    public long liknum;
    public long buynum;
    public long joinnum;
    public List<Issue> issues;

    public TreasureInfo gettreasureInfo;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.columnid);
        dest.writeString(this.routeid);
        dest.writeString(this.routename);
        dest.writeString(this.routeimage);
        dest.writeString(this.routearea);
        dest.writeString(this.routearea_en);
        dest.writeParcelable(this.urlinfo, flags);
        dest.writeString(this.marketprice);
        dest.writeString(this.currentprice);
        dest.writeString(this.routetime);
        dest.writeLong(this.hot);
        dest.writeString(this.createtime);
        dest.writeString(this.prepaidmoney);
        dest.writeInt(this.paytype);
        dest.writeLong(this.reviewnum);
        dest.writeLong(this.liknum);
        dest.writeLong(this.buynum);
        dest.writeLong(this.joinnum);
        dest.writeTypedList(this.issues);
        dest.writeParcelable(this.gettreasureInfo, flags);
    }

    public Route() {
    }

    protected Route(Parcel in) {
        this.columnid = in.readLong();
        this.routeid = in.readString();
        this.routename = in.readString();
        this.routeimage = in.readString();
        this.routearea = in.readString();
        this.routearea_en = in.readString();
        this.urlinfo = in.readParcelable(UrlInfo.class.getClassLoader());
        this.marketprice = in.readString();
        this.currentprice = in.readString();
        this.routetime = in.readString();
        this.hot = in.readLong();
        this.createtime = in.readString();
        this.prepaidmoney = in.readString();
        this.paytype = in.readInt();
        this.reviewnum = in.readLong();
        this.liknum = in.readLong();
        this.buynum = in.readLong();
        this.joinnum = in.readLong();
        this.issues = in.createTypedArrayList(Issue.CREATOR);
        this.gettreasureInfo = in.readParcelable(TreasureInfo.class.getClassLoader());
    }

    public static final Creator<Route> CREATOR = new Creator<Route>() {
        @Override
        public Route createFromParcel(Parcel source) {
            return new Route(source);
        }

        @Override
        public Route[] newArray(int size) {
            return new Route[size];
        }
    };

    @Override
    public String toString() {
        return "Route{" +
                "columnid=" + columnid +
                ", routeid='" + routeid + '\'' +
                ", routename='" + routename + '\'' +
                ", routeimage='" + routeimage + '\'' +
                ", routearea='" + routearea + '\'' +
                ", routearea_en='" + routearea_en + '\'' +
                ", urlinfo=" + urlinfo +
                ", marketprice='" + marketprice + '\'' +
                ", currentprice='" + currentprice + '\'' +
                ", routetime='" + routetime + '\'' +
                ", hot=" + hot +
                ", createtime='" + createtime + '\'' +
                ", prepaidmoney='" + prepaidmoney + '\'' +
                ", paytype=" + paytype +
                ", reviewnum=" + reviewnum +
                ", liknum=" + liknum +
                ", buynum=" + buynum +
                ", joinnum=" + joinnum +
                ", issues=" + issues +
                ", gettreasureInfo=" + gettreasureInfo +
                '}';
    }
}
