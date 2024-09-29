public boolean VulnerableCode(String studentName) {
 
    String query = "SELECT * FROM students WHERE name = '" + studentName + "'";
   
    return true;
}
