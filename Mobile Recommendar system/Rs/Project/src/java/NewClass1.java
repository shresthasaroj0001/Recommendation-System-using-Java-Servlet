
import com.Pcc.col.PCCC;
import com.Pcc.col.PCCDAO;
import com.Pcc.col.PCCModel;
import com.connectionFIles.ConnectionString_db;
import com.model.details.mobileDetailsModel;
import com.model.details.vector_detailsModel;
import com.search.col.searchddAo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class NewClass1 {

    public static void main(String[] args) {
        PCCDAO p = new PCCDAO();
        ArrayList<mobileDetailsModel> FromJsp = p.FromJsp("2s");
        System.out.println(" ");
    }
}
