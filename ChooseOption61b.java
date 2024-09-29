import javax.swing.JOptionPane;
public class ChooseOption61b {
	public static void main(String[] args) {
        int iLuaChon;
        String strLuaChon;

        iLuaChon = JOptionPane.showConfirmDialog(null, 
            "Co loi xay ra. Co muon tiep tuc?", "Loi", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);

        if (iLuaChon == JOptionPane.YES_OPTION) 
            strLuaChon = "Yes";
        else
            strLuaChon = "No";

        JOptionPane.showMessageDialog(null, "Ban da chon " + strLuaChon);
        System.exit(0);
	}
}
