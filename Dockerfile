FROM librespace/ansible

RUN apt update

# COPY ./roles.yml /
# RUN ansible-galaxy role install -r roles.yml

COPY ./playbook.yml /
RUN ansible-playbook playbook.yml

COPY ./srv /srv

EXPOSE 7680/udp
EXPOSE 7680/tcp

COPY entrypoint.sh /srv
COPY peote-server.conf /srv/peote-server.conf
WORKDIR /srv
ENTRYPOINT ./entrypoint.sh