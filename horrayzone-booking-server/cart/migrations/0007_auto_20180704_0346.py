# -*- coding: utf-8 -*-
# Generated by Django 1.11.2 on 2018-07-03 22:16
from __future__ import unicode_literals

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('cart', '0006_event_city'),
    ]

    operations = [
        migrations.RenameField(
            model_name='city',
            old_name='long',
            new_name='lng',
        ),
    ]
