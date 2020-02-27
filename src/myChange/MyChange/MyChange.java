package myChange.MyChange;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.scribble.core.type.name.Role;
import myChange.MyChange.roles.*;
import myChange.MyChange.ops.*;

public final class MyChange extends org.scribble.runtime.session.Session {
	public static final List<String> IMPATH = new LinkedList<>();
	public static final String SOURCE = "getSource";
	public static final org.scribble.core.type.name.GProtoName PROTO = org.scribble.core.type.session.STypeFactory.parseGlobalProtocolName("myChange.MyChange");
	public static final D1 D1 = myChange.MyChange.roles.D1.D1;
	public static final D2 D2 = myChange.MyChange.roles.D2.D2;
	public static final C C = myChange.MyChange.roles.C.C;
	public static final S S = myChange.MyChange.roles.S.S;
	public static final change change = myChange.MyChange.ops.change.change;
	public static final save save = myChange.MyChange.ops.save.save;
	public static final exit exit = myChange.MyChange.ops.exit.exit;
	public static final List<Role> ROLES = Collections.unmodifiableList(Arrays.asList(new Role[] {D1, D2, C, S}));

	public MyChange() {
		super(MyChange.IMPATH, MyChange.SOURCE, MyChange.PROTO);
	}

	@Override
	public List<Role> getRoles() {
		return MyChange.ROLES;
	}
}