package com.example.facebookapi.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name="fbcomment")
public class Comment {

	@EmbeddedId
	CommentPK commentPK;
}
