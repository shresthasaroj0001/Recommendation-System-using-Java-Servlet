
import com.Pcc.col.PCCC;
import com.Pcc.col.PCCDAO;
import com.controller.userLogin.User_Model;
import com.controller.userLogin.loginDAO;
import com.forntend.coln.DisplayDAO;
import com.model.details.mobileDetailsModel;
import com.search.col.searchddAo;
import com.upload.controler.UploadDAo;
import com.value.vector.Cosim;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NewClass {
    public static void main(String[] args) {
      DisplayDAO d = new DisplayDAO();
        ArrayList<mobileDetailsModel> NewArrival = d.NewArrival();
    }
}
