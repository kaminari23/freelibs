package freelib.services.impl;

import freelib.DTO.FreelibDTO;
import freelib.DTO.InventoryDTO;
import freelib.DTO.UserDTO;
import freelib.datasource.DatasourceImpl;
import freelib.services.api.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryServiceImpl implements Service<Integer, InventoryDTO> {
    private static InventoryServiceImpl service;
    public DatasourceImpl data_source;
    private InventoryServiceImpl() {
        data_source = DatasourceImpl.getInstance();
    }
    public static synchronized InventoryServiceImpl getInstance() {
        if(service==null){service=new InventoryServiceImpl();}
        return service;
    }

    @Override
    public List<InventoryDTO> getAll() {
        List <InventoryDTO> arrayList = new ArrayList();
        DatasourceImpl data_source = DatasourceImpl.getInstance();
        Connection connection = data_source.getConnection();
        try{

            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM advisedto";
            ResultSet result_set = statement.executeQuery(sql);
//            connection.close();
            while(result_set.next()){
                int id = result_set.getInt("id");
                String name = result_set.getString("Name");
                String articul = result_set.getString("Articul");
                String picture = result_set.getString("Picture");
                String price = result_set.getString("Price");
                String material = result_set.getString("Material");
                String equipment = result_set.getString("Equipment");
                String cooling = result_set.getString("Cooling");
                String diameter = result_set.getString("Diameter");
                String currency = result_set.getString("Currency");
                String description = result_set.getString("Description");
                String type = result_set.getString("Type");
                arrayList.add(new InventoryDTO(id,articul,name,picture,price,material,equipment,cooling,
                        diameter,currency,description,type));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
//    public List<FreelibDTO> setEnc() {
//        List <FreelibDTO> arrayList = new ArrayList();
//        DatasourceImpl data_source = DatasourceImpl.getInstance();
//        Connection connection = data_source.getConnection();
//        try{
//
//            Statement statement = connection.createStatement();
//            String sql = "SET NAMES 'windows-1251'";
//           statement.executeQuery(sql);
////            connection.close();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return arrayList;
//    }

    public List<FreelibDTO> getEver() {
        List <FreelibDTO> arrayList = new ArrayList();
        DatasourceImpl data_source = DatasourceImpl.getInstance();
        Connection connection = data_source.getConnection();
        try{

            PreparedStatement statement = null;

            statement = connection.prepareStatement("SELECT * FROM booklist ");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String annotation = resultSet.getString("annotation");
                String author = resultSet.getString("author");
                String picture = resultSet.getString("picture");
                String capacity = resultSet.getString("capacity");
                String pubdate = resultSet.getString("pubdate");


                arrayList.add(new FreelibDTO(id,name,annotation,author,picture,capacity,pubdate));
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
    public List<FreelibDTO> getScifi() {
        List <FreelibDTO> arrrayList = new ArrayList();
        DatasourceImpl data_source = DatasourceImpl.getInstance();
        Connection connection = data_source.getConnection();
        try{


            PreparedStatement statement = null;
            int gid = 2;
            statement = connection.prepareStatement(" SELECT b . * ,  g.gname \n" +
                    "FROM booklist b \n" +
                    "INNER JOIN bag bg ON b.id = bg.id\n" +
                    "INNER JOIN genres g ON g.gid = bg.gid\n" +
                    "WHERE g.gid=?");
            statement.setInt(1,gid);
            ResultSet resultSet = statement.executeQuery();
            connection.close();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String annotation = resultSet.getString("annotation");
                String author = resultSet.getString("author");
                String picture = resultSet.getString("picture");
                String capacity = resultSet.getString("capacity");
                String pubdate = resultSet.getString("pubdate");


                arrrayList.add(new FreelibDTO(id,name,annotation,author,picture,capacity,pubdate));
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        connection.close();



        return arrrayList;
    }
    public List<FreelibDTO> getDetect() {
        List <FreelibDTO> arrayList = new ArrayList();
        try{
            DatasourceImpl data_source = DatasourceImpl.getInstance();
            Connection connection = data_source.getConnection();
            PreparedStatement statement = null;
            int gid = 7;
            statement = connection.prepareStatement(" SELECT b . * ,  g.gname \n" +
                    "FROM booklist b \n" +
                    "INNER JOIN bag bg ON b.id = bg.id\n" +
                    "INNER JOIN genres g ON g.gid = bg.gid\n" +
                    "WHERE g.gid=?");
            statement.setInt(1,gid);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String annotation = resultSet.getString("annotation");
                String author = resultSet.getString("author");
                String picture = resultSet.getString("picture");
                String capacity = resultSet.getString("capacity");
                String pubdate = resultSet.getString("pubdate");


                arrayList.add(new FreelibDTO(id,name,annotation,author,picture,capacity,pubdate));
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return arrayList;
    }
    public List<FreelibDTO> getbyGenre(int gid) {
        List <FreelibDTO> arrayList = new ArrayList();
        DatasourceImpl data_source = DatasourceImpl.getInstance();
        Connection connection = data_source.getConnection();
        try{

            PreparedStatement statement = null;

            statement = connection.prepareStatement("SELECT b . * , g.gname \n" +
                    "FROM booklist b \n" +
                    "INNER JOIN bag bg ON b.id = bg.id\n" +
                    "INNER JOIN genres g ON g.gid = bg.gid\n" +
                    "WHERE g.gid=?");
            statement.setInt(1,gid);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String annotation = resultSet.getString("annotation");
                String author = resultSet.getString("author");
                String picture = resultSet.getString("picture");
                String capacity = resultSet.getString("capacity");
                String pubdate = resultSet.getString("pubdate");


                arrayList.add(new FreelibDTO(id,name,annotation,author,picture,capacity,pubdate));
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return arrayList;
    }
    public List<UserDTO> findUser(String uname, String upass){
        List<UserDTO> invent = new ArrayList<>();
        Connection connection = data_source.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(" SELECT * FROM users WHERE uname LIKE ? AND upass LIKE ?");
            statement.setString(1,uname);
            statement.setString(2,upass);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int uid = resultSet.getInt("uid");
                String urole = resultSet.getString("urole");
                String upicture = resultSet.getString("upicture");
                invent.add(new UserDTO(uid,uname, upass, urole, upicture));
                connection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return invent;
    }

    public List<FreelibDTO> getByName(String name){
        List<FreelibDTO> invent = new ArrayList<>();
        Connection connection = data_source.getConnection();
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(" SELECT * FROM booklist WHERE name LIKE ?");
            statement.setString(1,name);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String annotation = resultSet.getString("annotation");
                String author = resultSet.getString("author");
                String picture = resultSet.getString("picture");
                String capacity = resultSet.getString("capacity");
                String pubdate = resultSet.getString("pubdate");

                invent.add(new FreelibDTO(id,name, annotation, author, picture, capacity, pubdate));
                connection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return invent;
    }
    public List<FreelibDTO> getByGen(int gid){
        List<FreelibDTO> invent = new ArrayList<>();
        Connection connection = data_source.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(" SELECT * FROM booklist INNER JOIN bag ON WHERE gid=? ");
            statement.setInt(1,gid);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String annotation = resultSet.getString("annotation");
                String author = resultSet.getString("author");
                String picture = resultSet.getString("picture");
                String capacity = resultSet.getString("capacity");
                String pubdate = resultSet.getString("pubdate");
                invent.add(new FreelibDTO(id,name, annotation, author, picture, capacity, pubdate));
                connection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return invent;
    }
    @Override
    public InventoryDTO getById(Integer key) {
        return null;
    }

    public void deleter(int id) {
        Connection connection = data_source.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("DELETE FROM adviser_list.advisedto WHERE advisedto.id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
//            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<InventoryDTO> getbyid(int id){
        List<InventoryDTO> item = new ArrayList<>();
        Connection connection = data_source.getConnection();
        PreparedStatement statement = null;

        try {
            statement=connection.prepareStatement("SELECT * FROM advisedto WHERE id = ?");
            statement.setInt(1, id);
            ResultSet result_set = statement.executeQuery();
            while(result_set.next()){
                String name = result_set.getString("Name");
                String articul = result_set.getString("Articul");
                String picture = result_set.getString("Picture");
                String price = result_set.getString("Price");
                String material = result_set.getString("Material");
                String equipment = result_set.getString("Equipment");
                String cooling = result_set.getString("Cooling");
                String diameter = result_set.getString("Diameter");
                String currency = result_set.getString("Currency");
                String description = result_set.getString("Description");
                String type = result_set.getString("Type");
                item.add(new InventoryDTO(id, articul, name, picture, price,material,
                        equipment,cooling,diameter,currency,description,type));
//                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return item;
    }

    public void addUser(String uname, String upass){
        Connection connection = data_source.getConnection();
        PreparedStatement statement = null;
        String upicture = "default";
        String urole = "USER";
        try{
            statement = connection.prepareStatement("INSERT INTO users (uname, upass, urole, upicture) VALUES (?, ?, ?, ?)");
                statement.setString(1, uname);
                statement.setString(2, upass);
                statement.setString(3, upicture);
                statement.setString(4,urole);

                statement.executeUpdate();

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(InventoryDTO entity) {

    }

    @Override
    public void delete(Integer key) {

    }

    @Override
    public void update(int i, InventoryDTO entity) {

    }
   public Integer tryParseInt(String s) {
        try {
            return new Integer(s);
        } catch (NumberFormatException e) {
            return null; // не-а, не int
        }
    }
}
