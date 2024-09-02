#!/bin/bash

perl -I. peote-server.pl &
touch peote.log 
tail -f peote.log