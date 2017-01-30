////////////////////////////////////////////////////////////////////////
//
// Table.java
//
// This file was generated by MapForce 2016r2.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the MapForce Documentation for further details.
// http://www.altova.com/mapforce
//
////////////////////////////////////////////////////////////////////////

package com.altova.text.tablelike.csv;

import com.altova.text.tablelike.ISerializer;

public class Table extends com.altova.text.tablelike.Table
{
	private int m_lineEnd = 0;
	
	public Table(com.altova.typeinfo.TypeInfo tableType, int lineEnd) 
	{
		super(false);
		this.tableType = tableType;
		this.m_lineEnd = lineEnd;
		init();
	}

	public Format getFormat() { return ((Serializer) m_Serializer).getFormat(); }

	protected ISerializer createSerializer()
	{
		return new Serializer(this,m_lineEnd);
	}

	protected void initHeader(com.altova.text.tablelike.Header header)
	{
		for( int iMember = 0 ; iMember < tableType.getMembers().length ; ++iMember )
		{
			com.altova.typeinfo.MemberInfo member = tableType.getMembers()[iMember];
			header.add(
				new com.altova.text.tablelike.ColumnSpecification(member.getLocalName()));
		}
	}
}