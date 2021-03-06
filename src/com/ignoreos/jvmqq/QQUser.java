package com.ignoreos.jvmqq;
import com.ignoreos.jvmqq.Message.PictureStore;
import com.ignoreos.jvmqq.Utils.Util;
import java.util.*;

import com.ignoreos.jvmqq.sdk.Group_List;
import com.ignoreos.jvmqq.sdk.Friend_List;

public class QQUser
{
	
	public long QQ;
	public byte[] MD51;
	public byte[] MD52;
	public String NickName;
	public int Gender;
	public int Age;
	public long logintime;
	public boolean islogined = false;
	public boolean offline = false;

	public byte[] QQPacket00BaVerifyCode=new byte[0];

	public byte Next;

	public byte[] QQPacket00BaKey = Util.RandomKey();

	public byte QQPacket00BaSequence=0x01;

	public byte[] QQPacket00BaFixKey =Util.str_to_byte("69 20 D1 14 74 F5 B3 93 E4 D5 02 B3 71 1A CD 2A");

	public String userskey;

	public String bkn;

	public String pskey;

	public String qungtk;

	public String quncookie;

	public Group_List group_list;
	
	public Friend_List friend_list;
	
	public QQUser(long qqNum,byte[] pwd)
	{
		
		QQ = qqNum;
		SetPassword(pwd);
	}
	
	
	public void SetPassword(byte[] pwd)
	{

		MD51 = pwd;
		MD52 = Util.MD5(Util.byteMerger(MD51,Util.ToByte(this.QQ)));
	}
	
	
	
	public List<PictureStore> imgs = new ArrayList<PictureStore>();
	
	public TXProtocol TXProtocol  = new TXProtocol();
	
	public byte[] QQPacket0825Key  = Util.RandomKey();
	
	public boolean IsLoginRedirect;
	
	public byte[] QQPacket0836Key1 = Util.RandomKey();
	
}
